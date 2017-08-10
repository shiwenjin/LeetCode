package com.zhanghao.java;

/**
 * Created by zhangh on 2017/8/10.
 * 倒置数字
 */
public class Reverse {
    public static void main(String[] args) {

        System.out.println(reverse(1000000003));
        System.out.println(reverse(-123));

    }

    static int  reverse(int x) {
        String strX = String.valueOf(x);
        StringBuilder xStr = new StringBuilder();
        StringBuilder deXStr = new StringBuilder("-");

        if (x >= 0) {
            for (int i = strX.length() - 1; i >= 0; i--) {
                xStr.append(strX.charAt(i));
            }

            try {
                return   Integer.valueOf(xStr.toString());
            } catch(Exception e) {
                return 0;
            }
        } else {
            String stX = strX.substring(1);
            for (int i = stX.length() - 1; i >= 0; i--) {
                deXStr.append(stX.charAt(i));
            }
            try {
                return Integer.valueOf(deXStr.toString());
            } catch (Exception e) {
                return 0;
            }
        }
    }
}
