package com.zhanghao.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhangh on 2017/8/30 20:45.
 * 最后一个单词的长度
 * 判断非空应该先写在前面
 */
public class LengthOfLastWord {
    private static Logger logger = LoggerFactory.getLogger(PalindromeNumber.class);

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hello worrld"));
    }

    private static int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0 || s.trim().length() == 0 ) {
            return 0;
        } else {
            String[] listStr = s.split(" ");
                logger.error("最后一个字符串为：{}", listStr[listStr.length - 1]);
                return listStr[listStr.length - 1].length();
            }
        }
    }
