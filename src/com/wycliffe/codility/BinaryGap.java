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
public class BinaryGap {

    static public int solution(int N) {
        if(N==1){
            return 0;
        }
        String strN = Integer.toBinaryString(N);
        System.out.println(">>>>>" + strN);
        int tempCount = 0;
        int finalCount = 0;

        for (int i = 0; i < strN.length(); i++) {
            if (strN.charAt(i) == '0') {
                tempCount++;
                System.out.println("//////"+tempCount+"Value of i"+i);
                continue;
            } else if (strN.charAt(i)== '1') {
                if (tempCount > finalCount) {
                    finalCount = tempCount;
                    tempCount = 0;
                }

            }
        }

        return finalCount;
    }

    public static void main(String args[]) {
        int N = 1376796946;

        System.out.println(">>>" + solution(N));
    }

}
