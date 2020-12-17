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
public class TernaryOperatorTest {

    public static void main(String args[]) {
        int x = 10;
        int y = 30;
        if (x > y) {
            int z = x;
            System.out.println("Value is:"+z);
        }
        if(y>x){
            int z = y;
            System.out.println("Value is:"+z);
        }
        
        //using ternary operator
        int z = (x > y) ? x : y;
        System.out.println("Ternary value"+z);
    }
}
