package com.xx.test;

import cn.hutool.extra.emoji.EmojiUtil;
import com.vdurmont.emoji.EmojiParser;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author lxx
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/4/12
 */
public class Test2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("\u6D4B\u8BD5");
        list.add("\uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC66\u200D\uD83D\uDC66\uD83D\uDC68\u200D\uD83D\uDC68\u200D\uD83D\uDC66\u200D\uD83D\uDC66\uD83D\uDC69\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC67\uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC66\uD83D\uDC68\u200D\u2764\uFE0F\u200D\uD83D\uDC68\uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67");
        list.add("&#129305;&#129305;&#129305;&#128150;你");
        list.add("测试");
        list.add("评论测试特殊字符");
        list.add("&#128054;&#128054;&#128054;");
        list.add("&#127773;&#127773;&#127773;");
        list.add("都过早了没");
        list.add("我看看");
        list.add("&#127849;");

        list.forEach(str -> {
            String content = EmojiParser.parseToUnicode(str);
            System.out.println("content = " + content);

        });


    }
}
