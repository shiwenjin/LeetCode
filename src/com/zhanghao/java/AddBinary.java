package com.zhanghao.java;

/**
 * Created by zhangh on 2017/9/4 23:10.
 * 两个二进制字符串的和
 *
 * 1.取两个游标，m, n, 把他们两个加起来
 * 2.将其值除以2取余数得到当前位的数
 * 3.将其值除以2的商为进位的数
 * 4.判断进位的数是否大于1，如果大于1添加一个"1"
 */
public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1", "11"));
    }

    private static String addBinary(String a, String b) {
        String res = "";
        int m = a.length() - 1, n = b.length() - 1, carry = 0;
        while (m >= 0 || n >= 0) {
            int p = m >= 0 ? a.charAt(m--) - '0' : 0;
            int q = n >= 0 ? b.charAt(n--) - '0' : 0;
            int sum = p + q + carry;

            //当前位的数字
            res = (sum % 2) + res;

            //对2取商即为当前进位的值
            carry = sum / 2;
        }
        return carry == 1 ? "1" + res : res;
    }

//    int i = a.length() - 1, j = b.length() - 1, carry = 0;
//    StringBuilder sb = new StringBuilder();
//
//        while (i >= 0 || j >= 0) {
//        int sum = carry;
//        if (i >= 0) {
//            sum += a.charAt(i--) - '0';
//        }
//        if (j >= 0) {
//            sum += b.charAt(j--) - '0';
//        }
//        sb.append(sum % 2);
//        carry = sum / 2;
//    }
//
//        if (carry == 1) sb.append(carry);
//        return sb.reverse().toString();
}
