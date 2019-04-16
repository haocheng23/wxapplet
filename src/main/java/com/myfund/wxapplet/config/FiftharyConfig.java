package com.myfund.wxapplet.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef="entityManagerFactoryFifthary",
        transactionManagerRef="transactionManagerFifthary",
        basePackages= { "com.myfund.wxapplet.repository.fifthary" })
public class FiftharyConfig {

    @Autowired
    private JpaProperties jpaProperties;

    @Autowired
    @Qualifier("fiftharyDataSource")
    private DataSource fiftharyDataSource;

    @Value("${spring.jpa.hibernate.fifthary-dialect}")
    private String fiftharyDialect;


    @Bean(name = "entityManagerFifthary")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return entityManagerFactoryFifthary(builder).getObject().createEntityManager();
    }


    @Bean(name = "entityManagerFactoryFifthary")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryFifthary (EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(fiftharyDataSource)
                .properties(getVendorProperties(fiftharyDataSource))
                .packages("com.myfund.wxapplet.entity.fifthary")
                .persistenceUnit("fiftharyPersistenceUnit")
                .build();
    }

    private Map<String, String> getVendorProperties(DataSource dataSource) {
        Map<String,String> map = new HashMap<>();
        map.put("hibernate.dialect",fiftharyDialect);
        // jpaProperties.getHibernate().getNaming().setPhysicalStrategy("org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy");
        //jpaProperties.getHibernate().getNaming().setImplicitStrategy("org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy");
        jpaProperties.setProperties(map);
        return jpaProperties.getProperties();
    }

    @Bean(name = "transactionManagerFifthary")
    PlatformTransactionManager transactionManagerFifthary(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryFifthary(builder).getObject());
    }

}
