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
public class IntegerWithError {

    /*
declare return int value
check limit and sign the string value of integer if less than zero
else reverse the string value of the integer 
try the value of string wile parsing it back to integer
catch large value greater than Integer
     */
    public int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            x = Math.abs(x);
            isNegative = true;
        }
        String reversedNum = new StringBuilder(String.valueOf(x)).reverse().toString();

        reversedNum = isNegative ? ("-" + reversedNum) : reversedNum;

        try {
            return Integer.parseInt(reversedNum);
        } catch (Exception e) {
            return 0;
        }

    }

    public static void main(String[] args) {
        int x = -123;

        IntegerWithError obj = new IntegerWithError();
        System.out.println(obj.reverse(x));
        System.out.println(Integer.toString(x));

    }

}
