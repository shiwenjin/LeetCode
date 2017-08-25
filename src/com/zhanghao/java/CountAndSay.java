package com.zhanghao.java;

/**
 * Create by zhangh on 2017/8/24.
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 一个一
 * 两个二
 * 一个一一个二
 *
 * 离成功只有一步之遥，没想到"*"做处理，大大简化了程序，哎
 *
 * */
public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(4 ));
    }

    private static String countAndSay(int n) {
        StringBuilder s = new StringBuilder();
        String preStr;
        if (n == 1) {
            return "1";
        } else if (n == 2) {
            return "11";
        } else {
            //先知道n-1项的值
            preStr = countAndSay(n-1) + "*";
        }

        //递归调用，然后对字符串处理
        char[] c = preStr.toCharArray();
        int count = 1;
        for(int i = 0; i < c.length - 1;i++){
            if(c[i] == c[i+1]){
                count++;//计数增加
            }else{
                s = s.append(count).append(c[i]);//上面的*标记这里方便统一处理
                count = 1;//初始化
            }
        }
        return s.toString();
    }

}