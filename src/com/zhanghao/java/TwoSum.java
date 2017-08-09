package com.zhanghao.java;

/**
 * Created by zhangh on 2017/8/10.
 */
public class TwoSum {

    public static void  main(String[] args) {
        int[] a = {2, 7, 1,9};
        int b = 10;
        int[] c = twoSum(a, b);

        for (int i = 0; i < c.length; i++)
            System.out.println(c[i]);

    }

    static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int point = 0;

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == temp && j != i) {
                    result[point] = i;
                    result[point+1] = j;
                    point++;
                }
            }
        }

        return result;
    }

}
