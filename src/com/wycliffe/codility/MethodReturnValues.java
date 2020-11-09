/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility;

/**
 *
 * @author WOCHIENG1
 */
public class MethodReturnValues {
    static int  sumNumbers(int x, int y){
        return 5 + x + y;
    }
    public static void main(String args[]){
        int z = sumNumbers(3,4);
        System.out.println("Sum is: "+z);
    }
}
