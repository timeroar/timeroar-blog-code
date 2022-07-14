package com.timeroar.test;

import cn.hutool.extra.pinyin.PinyinUtil;
import com.timeroar.test.util.SitemapUtil;

/**
 * <p>TestMain</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2022/6/29 11:05
 */
public class TestMain {

    public static void main(String[] args) {
       String pinyin = "wangziming";
        // 将拼音转换为汉字
        String pinyin1 = PinyinUtil.getPinyin(pinyin);
        System.out.println(pinyin1);
    }
}


