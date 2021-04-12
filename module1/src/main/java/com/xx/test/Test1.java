package com.xx.test;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.extra.spring.SpringUtil;
import cn.hutool.extra.tokenizer.Result;
import cn.hutool.extra.tokenizer.TokenizerEngine;
import cn.hutool.extra.tokenizer.TokenizerUtil;
import cn.hutool.extra.tokenizer.Word;
import cn.hutool.extra.tokenizer.engine.ansj.AnsjEngine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description
 * @Author lxx
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/3/21
 */
public class Test1 {

    public static void main(String[] args) throws InterruptedException {

        /*Test1 test1 = new Test1();

        Map<String,String> map = new HashMap<>();
        map.put("a","张三");
        map.put("b","李四");*/

        //自动根据用户引入的分词库的jar来自动选择使用的引擎
        TokenizerEngine engine = new AnsjEngine();

        //解析文本
        String text = "这两个方法的区别在于返回值";
        Result result = engine.parse(text);
        //输出：这 两个 方法 的 区别 在于 返回 值
        String resultStr = CollUtil.join((Iterator<Word>) result, " ");

        System.out.println("resultStr = " + resultStr);

//        String temp = "";
//
//        boolean b = StrUtil.equals(temp, "");
//
//        System.out.println("b = " + b);
//
//
//        StrBuilder strBuilder = new StrBuilder();
//
//        strBuilder.append("a").append("b");

    }

    public static List<User> getUserList() {
        List<User> userlist = new ArrayList<>();
        return userlist;
    }
}
