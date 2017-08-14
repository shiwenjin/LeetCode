package com.zhanghao.java;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangh on 2017/8/14.
 * 罗马数字转化为整数
 */
public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("VI"));
    }

    private static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('X', 10);
        map.put('C', 100);
        map.put('M', 1000);
        map.put('V', 5);
        map.put('L', 50);
        map.put('D', 500);

        int sum = 0;

        //第一，如果当前数字是最后一个数字，或者之后的数字比它小的话，则加上当前数字
        //第二，其他情况则减去这个数字
        for (int i = 0; i < s.length(); i++) {
            if (i== s.length()-1 || map.get(s.charAt(i)) >= map.get(s.charAt(i+1))) {
                sum += map.get(s.charAt(i));
            } else {
                sum -= map.get(s.charAt(i));
            }
        }
        return sum;
    }
}
