package com.zhanghao.java;

/**
 * Created by zhangh on 2017/8/22.
 * 别人家的代码-_-#
 */
public class StrStr {
    public static void main(String[] args) {
        System.out.println(strStr("daas","aaa"));
    }
    
    private static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        int m = haystack.length(), n = needle.length();
        if (m < n) return -1;
        for (int i = 0; i <= m - n; ++i) {
            int j;
            for (j = 0; j < n; ++j) {
                if (haystack.charAt(i+j) != needle.charAt(j)) break;
            }
            if (j == n) return i;
        }
        return -1;
    }
}