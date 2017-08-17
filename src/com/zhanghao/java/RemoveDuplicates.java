package com.zhanghao.java;

/**
 * Created by zhangh on 2017/8/17.
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b = {1,1,2};
        System.out.println(removeDuplicates(a));
        System.out.println(removeDuplicates(b));
    }

    private static int removeDuplicates(int[] nums) {
        int count = 1;
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] != nums[i+1]) {
                nums[count] = nums[i+1];
                count++;
            }
        }
        return count;
    }
}
