package com.myfund.wxapplet.confignew;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.HashMap;
import java.util.Map;

/**
 * 数据源配置
 *
 * @author: haocheng
 * @date: 2019-06-11 16:26
 *
 */
@Configuration
@EnableScheduling
@Slf4j
public class DataSourceConfig {
    @Autowired
    private DBProperties dbProperties;

    /**
     * 设置动态数据源，通过@Primary 来确定主DataSource
     *
     */
    @Bean(name = "dataSource")
    public DynamicDataSource dataSource(){
        DynamicDataSource dynamicDataSource = new DynamicDataSource();

        //1.设置默认数据源
        dynamicDataSource.setDefaultTargetDataSource(dbProperties.getPrimary());
        //2.配置多数据源
        Map<Object, Object> map = new HashMap<>();
        map.put("primary", dbProperties.getPrimary());
        map.put("secondary", dbProperties.getSecondary());
        map.put("thirdary", dbProperties.getThirdary());
        map.put("fourthary", dbProperties.getFourthary());
        map.put("fifthary", dbProperties.getFifthary());
        //3.存放数据源集
        dynamicDataSource.setTargetDataSources(map);
        return dynamicDataSource;
    }
}
