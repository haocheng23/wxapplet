package com.myfund.wxapplet.config;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean(name = "primaryDataSource")
    @Primary
    @Qualifier("primaryDataSource")
    @ConfigurationProperties(prefix = "spring.primary-datasource")
    public DataSource primaryDatasource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "secondaryDataSource")
    @Qualifier("secondaryDataSource")
    @ConfigurationProperties(prefix = "spring.secondary-datasource")
    public DataSource secondaryDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "thirdaryDataSource")
    @Qualifier("thirdaryDataSource")
    @ConfigurationProperties(prefix = "spring.thirdary-datasource")
    public DataSource thirdaryDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "fourtharyDataSource")
    @Qualifier("fourtharyDataSource")
    @ConfigurationProperties(prefix = "spring.fourthary-datasource")
    public DataSource fourtharyDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "fiftharyDataSource")
    @Qualifier("fiftharyDataSource")
    @ConfigurationProperties(prefix = "spring.fifthary-datasource")
    public DataSource fiftharyDataSource() {
        return DataSourceBuilder.create().build();
    }

}
