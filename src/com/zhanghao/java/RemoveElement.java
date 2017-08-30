package com.zhanghao.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by zhangh on 2017/8/21.
 */
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 2;
//        System.out.println(removeElement(nums, val));
        removeElement(nums,2);
    }

    private static void removeElement(int[] nums, int val) {
//        Integer[] a =  new Integer[nums.length];
//        for (int i = 0; i < nums.length; i++)
//            a[i] = Integer.valueOf(nums[i]);
//
//
//        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(a));
//
//        Iterator<Integer> sListIterator = arrayList.iterator();
//
//        while(sListIterator.hasNext()) {
//            Integer i = sListIterator.next();
//            if(i.equals(val))
//                sListIterator.remove();
//         }

//         return arrayList.size();


//        正确答案：
        int num = 0;
        for (int i = 0; i< nums.length; i++)
        {
            if (nums[i] != val)
                nums[num++] = nums[i];
        }

        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i]);
    }


}
