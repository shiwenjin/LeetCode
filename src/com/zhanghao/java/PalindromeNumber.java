package com.zhanghao.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhangh on 2017/8/12.
 * 判断一个整数是否为回文数
 */
public class PalindromeNumber {

    private static Logger logger = LoggerFactory.getLogger(PalindromeNumber.class);


    public static void main(String[] args) {
        int x = 4334;
        System.out.println(isPalindrome(x));
    }

    static private boolean isPalindrome(int x) {
        if (x>=Integer.MAX_VALUE || x <=Integer.MIN_VALUE) {
            return false;
        }

        if (x < 0) {
            return false;
        } else {
            int temp = x;
            int sum = 0;
            int m = 10;
            while (temp > 0) {
                sum = sum*m + temp % m; //（取余数）每循环一次取各个位数
                temp = temp / m;
            }
            return sum == temp;
        }
    }
}
