package com.zhanghao.java;

/**
 * Created by zhangh on 2017/8/25.
 * 贪心算法，动态规划
 */
public class MaxSubArray {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis(); // 这段代码放在程序执行前
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(a));
        long end = System.currentTimeMillis() - begin; // 这段代码放在程序执行后
        System.out.println("耗时：" + end + "毫秒");
    }

    private static int maxSubArray(int[] A) {
        if (A == null || A.length == 0){
            return 0;
        }

        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            max = Math.max(max, sum);
            sum = Math.max(sum, 0);
        }

        return max;

    }
//    //比较当n个数相加时的最大值，n从1开始，n结束
//    private static int maxSubArray(int[] nums) {
//        int max = Integer.MIN_VALUE;
//        for (int n = 1; n <= nums.length; n++) {
//            int m = max(n, nums);
//
//            if (m > max)
//                max = m;
//        }
//
//        return max;
//
//    }
//
//    private static int max(int n, int[] nums) {
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 0; i < nums.length + 1 - n; i++) {
//            int sum = 0;
//            if (n == 1) {
//                sum = nums[i];
//            } else {
//                for (int j = 0; j < n; j++) {
//                    sum = sum + nums[i + j];
//                }
//            }
//            if (sum > max)
//                max = sum;
//        }
//        return max;
//    }
}
