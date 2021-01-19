/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility.simpleapps;

/**
 *
 * @author WOCHIENG1
 */
public class SumOfEvenNumbers {
    public static void main(String args[]){
        int mod = 0;
        int sum = 0;
        for(int count = 0; count<=20; count++){
            mod = count%2;
            
            if(mod==0){
                sum += count;
                System.out.println("numbers"+count);
            }
        }
        System.out.println("Sum of even numbers is: "+sum);
    }
}
