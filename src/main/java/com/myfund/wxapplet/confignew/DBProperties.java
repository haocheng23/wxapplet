package com.myfund.wxapplet.confignew;

import com.zaxxer.hikari.HikariDataSource;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 实际数据源配置
 *
 * @author: haocheng
 * @date: 2019-06-11 16:17
 *
 */
@Component
@Data
@ConfigurationProperties(prefix = "spring.datasource")
public class DBProperties {
    private HikariDataSource primary;
    private HikariDataSource secondary;
    private HikariDataSource thirdary;
    private HikariDataSource fourthary;
    private HikariDataSource fifthary;
}
