package com.zhanghao.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by zhangh on 2017/8/16.
 */
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.printf(String.valueOf(isValid("([)]")));
    }

    private static  boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();

        map.put('[', ']');
        map.put('{', '}');
        map.put('(', ')');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '{':
                case '[':
                case '(':
                    stack.push(c);
                    break;
                case '}':
                case ']':
                case ')':
                    if (stack.isEmpty() || map.get(stack.pop()) != c) return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}
