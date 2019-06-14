package com.myfund.wxapplet.confignew;

/**
 * 动态数据源持有者，负责利用ThreadLocal存取数据源名称
 *
 * @author: haocheng
 * @date: 2019-06-11 15:32
 *
 */
public class DynamicDataSourceHolder {

    //本地线程共享对象
    private static final ThreadLocal<String> THREAD_LOCAL = new ThreadLocal<>();

    public static void putDataSouce(String name){
        THREAD_LOCAL.set(name);
    }

    public static String getDataSource(){
        return THREAD_LOCAL.get();
    }

    public static void removeDataSource(){
        THREAD_LOCAL.remove();
    }
}
