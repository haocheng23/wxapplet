package com.myfund.wxapplet.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * list中含map的排序
 *
 * @author: haocheng
 * @date: 2019-05-09 11:23
 *
 */
public class ListSort {

    public static void ListOfMap(List<Map<Object, Object>> list){
        Collections.sort(list, (o1, o2) -> {
            Double map1value = (Double) o1.get("thisYearRedound");
            Double map2value = (Double) o2.get("thisYearRedound");
            /**
             * 只有在value的值是int是用下面写法
             * 如果value是其他类型的用compareTo比较
             */
//                return map2value - map1value;//倒序， 反之升序
            //return String.valueOf(map1value).compareTo(String.valueOf(map2value));
            return map2value.compareTo(map1value);
        });
    }

}
