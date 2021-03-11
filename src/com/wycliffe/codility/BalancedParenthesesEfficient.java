/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility;

import java.util.*;

/**
 *
 * @author WOCHIENG1
 */
public class BalancedParenthesesEfficient {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] data = s.toCharArray();//1
        if (s == null) {
            return false;
        }
        if (s.isEmpty()) {
            return true;
        }
        if (data.length % 2 != 0) {
            return false;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] == '(' || data[i] == '{' || data[i] == '[')//push to stck
            {
                stack.push(data[i]);
            } else {

                if (!stack.isEmpty() && ((stack.peek() == '(' && data[i] == ')')
                        || (stack.peek() == '{' && data[i] == '}')
                        || (stack.peek() == '[' && data[i] == ']'))) {
                    stack.pop();
                } else {
                    return false;
                }
            }//end else          
        }//end for
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }//end method
    
    public static void main(String ...args){
        String s = "{[()()]}";
        BalancedParentheses obj = new BalancedParentheses();
        System.out.println(">>>>" + obj.isValid(s));
    }
}
