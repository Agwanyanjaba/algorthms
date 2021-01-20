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
    static public int solutionTwo(int N){
        int finalCount = 0;
        int tempCount = 0; 
        
        //convert the number into an array of binary string
        char [] binaryNumber = Integer.toBinaryString(N).toCharArray();
        
        if(N==1){
            return 0;
        }
        //loop through the array of chars, test for the values as '0' or '1'
        //increase count if the value is 0
        for(int i=0; i<binaryNumber.length; i++){
            if(binaryNumber[i]=='0'){
                tempCount++;
            }
            else if(binaryNumber[i]=='1' &&(tempCount>finalCount)){
               
                    finalCount=tempCount;
                    tempCount=0;
                
            }
        }
        return finalCount;
    }

    public static void main(String args[]) {
        int N = 200;

        System.out.println(">>>" + solution(N));
        System.out.println(">>>" + solutionTwo(N));
    }

}
