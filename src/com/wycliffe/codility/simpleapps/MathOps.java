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
public class MathOps {
    public int divide(int dividend, int divisor){
        double result  = (dividend/divisor);
        int quotient = (int)Math.floor(result);
        return quotient;
    }
    public static void main(String ... vargs){
        MathOps math = new MathOps();
        System.out.println(math.divide(-2147483648,-1));
        
    }
    
}
