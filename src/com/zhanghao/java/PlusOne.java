package com.zhanghao.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhangh on 2017/8/31 23:21.
 * 给定一个数组表示非负整数，其高位在数组的前面，对这个整数加1
 * 1.进位
 * 2.不进位
 */
public class PlusOne {
    private static Logger logger = LoggerFactory.getLogger(PlusOne.class);

    public static void main(String[] args) {
        int[] p = {8, 9, 9, 9};

        System.out.println(plusOne(p));
    }

    private static int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] p = new int[length+1];
        p[0] = 1;
        return p;

    }
}
