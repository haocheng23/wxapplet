package com.myfund.wxapplet.confignew;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 动态数据源实现类
 * 
 * @author: haocheng
 * @date: 2019-06-11 15:36
 * 
 */

@Slf4j
public class DynamicDataSource extends AbstractRoutingDataSource {

    //数据源路由，此方用于产生要选取的数据源逻辑名称
    @Override
    protected Object determineCurrentLookupKey() {
        //从线程共享中获取数据源名称
        return DynamicDataSourceHolder.getDataSource();
    }
}
