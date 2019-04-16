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
        entityManagerFactoryRef="entityManagerFactoryFourthary",
        transactionManagerRef="transactionManagerFourthary",
        basePackages= { "com.myfund.wxapplet.repository.fourthary" })
public class FourtharyConfig {

    @Autowired
    private JpaProperties jpaProperties;

    @Autowired
    @Qualifier("fourtharyDataSource")
    private DataSource fourtharyDataSource;

    @Value("${spring.jpa.hibernate.fourthary-dialect}")
    private String fourtharyDialect;


    @Bean(name = "entityManagerFourthary")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return entityManagerFactoryFourthary(builder).getObject().createEntityManager();
    }


    @Bean(name = "entityManagerFactoryFourthary")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryFourthary (EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(fourtharyDataSource)
                .properties(getVendorProperties(fourtharyDataSource))
                .packages("com.myfund.wxapplet.entity.fourthary")
                .persistenceUnit("fourtharyPersistenceUnit")
                .build();
    }

    private Map<String, String> getVendorProperties(DataSource dataSource) {
        Map<String,String> map = new HashMap<>();
        map.put("hibernate.dialect",fourtharyDialect);
        // jpaProperties.getHibernate().getNaming().setPhysicalStrategy("org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy");
        //jpaProperties.getHibernate().getNaming().setImplicitStrategy("org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy");
        jpaProperties.setProperties(map);
        return jpaProperties.getProperties();
    }

    @Bean(name = "transactionManagerFourthary")
    PlatformTransactionManager transactionManagerFourthary(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryFourthary(builder).getObject());
    }

}
