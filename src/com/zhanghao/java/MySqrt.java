package com.zhanghao.java;

/**
 * Created by zhangh on 2017/9/6 23:33.
 */
public class MySqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(5));
    }

    private static int mySqrt(int x) {
        if (x < 0)
            return -1;
        else
            return (int)Math.sqrt(x);

    }

//    别人家的孩子
//    long r = x;
//    while (r*r > x)
//    r = (r + x/r) / 2;  ————》 x与r的平方比值越接近1，r就越接近于x的根
//    return r;
}
