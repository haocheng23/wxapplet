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
        entityManagerFactoryRef="entityManagerFactoryThirdary",
        transactionManagerRef="transactionManagerThirdary",
        basePackages= { "com.myfund.wxapplet.repository.thirdary" })
public class ThirdaryConfig {

    @Autowired
    private JpaProperties jpaProperties;

    @Autowired
    @Qualifier("thirdaryDataSource")
    private DataSource thirdaryDataSource;

    @Value("${spring.jpa.hibernate.thirdary-dialect}")
    private String thirdaryDialect;


    @Bean(name = "entityManagerThirdary")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return entityManagerFactoryThirdary(builder).getObject().createEntityManager();
    }


    @Bean(name = "entityManagerFactoryThirdary")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryThirdary (EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(thirdaryDataSource)
                .properties(getVendorProperties(thirdaryDataSource))
                .packages("com.myfund.wxapplet.entity.thirdary")
                .persistenceUnit("thirdaryPersistenceUnit")
                .build();
    }

    private Map<String, String> getVendorProperties(DataSource dataSource) {
        Map<String,String> map = new HashMap<>();
        map.put("hibernate.dialect",thirdaryDialect);
        // jpaProperties.getHibernate().getNaming().setPhysicalStrategy("org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy");
        //jpaProperties.getHibernate().getNaming().setImplicitStrategy("org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy");
        jpaProperties.setProperties(map);
        return jpaProperties.getProperties();
    }

    @Bean(name = "transactionManagerThirdary")
    PlatformTransactionManager transactionManagerThirdary(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryThirdary(builder).getObject());
    }

}
