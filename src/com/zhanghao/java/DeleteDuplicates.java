package com.zhanghao.java;

import com.zhanghao.DataObject.ListNode;

/**
 * Created by zhangh on 2017/9/13 23:43.
 * 头结点的用处没搞懂，所以耗费时间比较久
 */
public class DeleteDuplicates {
    public static void main(String[] args) {
        ListNode node = new ListNode(18);
        node.next = new ListNode(3);
        node.next.next = new ListNode(3);
        ListNode n = deleteDuplicates(node);
        while (n != null) {
            System.out.println(n.val);
            n = n.next;
        }
    }

    private static ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;

        if (list == null || list.next == null) return head;

        ListNode p = list.next;

        while (list.next != null) {

            if (list.val ==  p.val) {
                list.next = p.next;
                p =  list.next;
            } else {
                list = p;
                p = p.next;
            }
        }
        return head;

    }

//    ListNode list = head;
//
//         while(list != null) {
//        if (list.next == null) {
//            break;
//        }
//        if (list.val == list.next.val) {
//            list.next = list.next.next;
//        } else {
//            list = list.next;
//        }
//    }
//
//         return head;
}
