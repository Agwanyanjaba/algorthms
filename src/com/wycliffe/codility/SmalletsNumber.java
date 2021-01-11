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
public class SmalletsNumber {

    public int smallestNumber(int N) {
        if(N>=0 && N<=50){
           int result = (int)((N % 9 + 1) * Math.pow(10, (N / 9)) - 1); 
        System.out.print(result);
        
        return result; 
        }
        else{
            return 0;
        }
        
    }

// Driver code
    public static void main(String[] args) {
        int N = 19;
        SmalletsNumber ob = new SmalletsNumber();
        ob.smallestNumber(N);
    }
}
