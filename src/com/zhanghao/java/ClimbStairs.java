package com.zhanghao.java;

/**
 * Created by zhangh on 2017/9/11 22:32.
 * 好难啊，唉
 */
public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

    //斐波那契数列
    //解题思路：
    //爬楼梯问题。经典的动态规划问题。
    // 每次上一个台阶或者两个台阶，问一共有多少种方法到楼顶。
    // 这个实际上就是斐波那契数列的求解。
    // 可以逆向来分析问题，如果有n个台阶，那么走完n个台阶的方式有f(n)种。
    // 而走完n个台阶有两种方法，先走完n-2个台阶，然后跨2个台阶；先走完n-1个台阶，然后跨1个台阶。
    // 所以f(n) = f(n-1) + f(n-2)。
    private static int climbStairs(int n) {
        // base cases
        if(n <= 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;

        int one_step_before = 2;
        int two_steps_before = 1;
        int all_ways = 0;

        for(int i=2; i<n; i++){
            all_ways = one_step_before + two_steps_before;
            two_steps_before = one_step_before;
            one_step_before = all_ways;
        }
        return all_ways;
    }
}
