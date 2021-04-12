package com.xx.test;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Test {

    static class A implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            return 1024;
        }
    }

    public static void main(String[] args) {

        System.out.println(Integer.MAX_VALUE);

        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);

        for (int i = 0; i < threadInfos.length; i++) {
            System.out.println("threadInfos = " + threadInfos[i].getThreadName());
        }

        

//        try {

//            for (int i = 0; i < 100; i++) {
//
//                try {
//                    if(i == 10) {
//                        System.out.println(i/0);
//                    }else{
//                        System.out.println(i/2);
//                    }
//
//                    System.out.println("======"+i);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        } catch (Exception e) {
           // e.printStackTrace();
//        }


//        FutureTask<Integer> future = new FutureTask<>(new A());
//
//        new Thread(future,"a").start();
//
//        new Thread(()->{
//
//        },"a").start();



        /*System.out.println(Thread.currentThread().getName());

        System.out.println("Test.main");

        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        List<String> list = new ArrayList<>(0);
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("刘四");
        list.forEach(item -> {
            System.out.println("item = " + item);

        });

        list.forEach(item -> {
            System.out.println("item = " + item);

        });


        for (int i = list.size() - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.println("list  = " + list.get(i));
            }
        }

        List<String> list1 = new ArrayList<>();

        list1.forEach(item-> System.out.println("item = " + item));*/
    }
}
