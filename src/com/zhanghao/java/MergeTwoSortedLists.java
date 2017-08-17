package com.zhanghao.java;

import com.zhanghao.DataObject.ListNode;

/**
 * Created by zhangh on 2017/8/17.
 * 合并两个有序链表
 * 别人家的算法—_-#
 */
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(31);
        ListNode node2 = new ListNode(32);
        System.out.println(mergeTwoLists(node1, node2).val);
        System.out.println(mergeTwoLists(node1, node2).next.val);
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       if (l1 == null) return l2;
       if (l2 == null) return l1;

       if (l1.val > l2.val) {
           ListNode temp = l2;
           temp.next = mergeTwoLists(l1, l2.next);
           return temp;
       } else {
           ListNode temp = l1;
           temp.next = mergeTwoLists(l1.next, l2);
           return temp;
       }
    }
}
