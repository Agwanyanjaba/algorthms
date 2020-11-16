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
public class ReturnArrayinMethods {

    public static void main(String[] args) {
        ReturnArrayinMethods myObject = new ReturnArrayinMethods();
        int arr[] = {1, 2, 3, 4, 5}; 
        int K = 20;
       
        
        /*
        Generate a unique Array of length N with sum of all subarrays divisible by N
         */
        int n = 6;
        makeArray(n);
        int count =  myObject.returnSum(arr, K);
        System.out.println("Length is:" + count);
        System.out.println("Arrays are:");
        printArray(arr);
        
        
    }

    public static void makeArray(int n) {

        int nextElement = 0;
        for (int i = 1; i <= n; i++) {
            nextElement = i * n;
            System.out.println(nextElement);
        }
    }

    public static int returnSum(int[] num, int K) {
        //arr[] = {1, 2, 3, 4, 5}, K = 20
        /*
        Maximum length L such that the sum of all subarrays of length L is less than K
        */
        System.out.println(num[3]);
        System.out.println(K);
        int count = 0;
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            
            sum  += num[i];
            System.out.println(">>>>>"+sum);
            
            count++;
        }
        if (sum < K) {
                return count;
            }
        
        return sum;
    }
    public static int[] returnArray(int[] arr) {
        int[] result = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            result[j++] = arr[i];
        }
        return result;
    }
    public static void printArray(int []arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.println(arr[i]+","+arr[j]);
                boolean big =false;
                if(arr[i]>arr[j]){
                    System.out.println("Status"+big);
                }
                else{
                    System.out.println("Status"+big);
                }
            }
        }
    }

}
