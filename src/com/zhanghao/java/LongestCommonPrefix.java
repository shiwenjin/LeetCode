package com.zhanghao.java;

/**
 * Created by zhangh on 2017/8/15.
 * 最长公共前缀
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"abca", "abc"};
        System.out.println(longestCommonPrefix(strs));
    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)  return "";

        String pre = strs[0];

        //从下标为1的字符串开始循环，判断是否包含子串strs[0],不包含则取其子串，再循环
        for (int i = 1;  i < strs.length; i++) {
            while (strs[i].indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length()-1);
            }
        }
        return pre;
    }
}
