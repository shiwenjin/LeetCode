package com.zhanghao.java;

/**
 * Created by zhangh on 2017/8/23.
 *
 */
public class SearchInsert {
    public static void main(String[] args) {
        int[] nums = {1, 3};
        int target = 2;

        System.out.println(searchInsert(nums, target));
    }

    private static int searchInsert(int[] nums, int target) {

        if (target < nums[0] ) {
            return 0;
        }

        if (target > nums[nums.length-1]) {
            return nums.length;
        }
        //循环数组每一位
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
            else if (nums[i] > target)
                return i;
        }

        return -1;
    }

    // 本题主要考察了二分查找，下面附上代码
    // int l = 0;  
    // int r = A.length-1;  
    // while(l<=r)  
    // {  
    //     int mid = (l+r)/2;  
    //     if(A[mid]==target)  
    //         return mid;  
    //     if(A[mid]<target)  
    //         l = mid+1;  
    //     else  
    //         r = mid-1;  
    // }  
    
}