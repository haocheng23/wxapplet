package com.myfund.wxapplet.confignew;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 目标数据源注解，注解在方法上指定数据源的名称
 * 
 * @author: haocheng
 * @date: 2019-06-11 15:39
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DataSource {
    //此处接收数据源名称
    String value();
}
