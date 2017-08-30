package com.zhanghao.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhangh on 2017/8/30 20:45.
 *
 */
public class LengthOfLastWord {
    private static Logger logger = LoggerFactory.getLogger(PalindromeNumber.class);

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hello worrld"));
    }

    private static int lengthOfLastWord(String s) {
        if (s.length() == 0 || s.trim().length() == 0 || s == null) {
            return 0;
        } else {
            String[] listStr = s.split(" ");
            logger.error("最后一个字符串为：{}", listStr);
            return listStr[listStr.length - 1].length();
        }
    }
}
