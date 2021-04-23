package com.xx.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author lxx
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/4/15
 */
public class Test3 {

    public static void main(String[] args) {

        //需要查询的数据
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5,10, 6, 20, 30, 40, 50, 60, 100);
        List<Integer> dataList= numbers.stream().sorted((x, y) -> x.compareTo(y)).skip(0).limit(10).collect(Collectors.toList());
        System.out.println(dataList.toString());
        
    }
}
