/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility;

import java.util.Stack;

/**
 *
 * @author WOCHIENG1
 */
public class StackTest {
    static String parentheses =  "({[";
    
    public static void main(String args[]){
        int length = parentheses.length();
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<length; i++){
            stack.push(parentheses.charAt(i));
        }
        System.out.println(stack);
        System.out.println("\n");
        char peeked = stack.peek();
        Character character1 = peeked;
        Character character2 = parentheses.charAt(1);
        if(character1.equals(character2)){
            System.out.println("Same");
            
        }else{
            System.out.println("Not Same");
        }
        if(peeked =='['){
            System.out.println(">>>>>"+parentheses);
        }
        System.out.println(peeked);
        if(!stack.empty()){
            System.out.println("Stack is not empty");
        };
    }
}
