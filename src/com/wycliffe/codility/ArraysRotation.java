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
public class ArraysRotation {
     //function to rotate last element of the array
    public static int[] rotateLastElement(int[] arr) {
        int lastElement = arr[arr.length-1];
        for (int i = arr.length - 2; i>=0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = lastElement;
        return arr;
    }

    //rotate array k number of times
    public static int[] shiftArray(int[] arr1, int K) {
        if(arr1.length<=1){
            return arr1;
        }
        int shiftedArray[] = new int[arr1.length];
        for (int i = 0; i < K; i++) {
            shiftedArray = rotateLastElement(arr1);
        }
        return shiftedArray;
    }
    
    public static void main(String ... args){
        int [] array =  {1,2,3,4};
        
        int [] shiftedArray = shiftArray(array, 4);
         System.out.println("New Shifted array is:");
        for(int index =0; index<shiftedArray.length; index++){
            System.out.println(shiftedArray[index]);
        }
    }
}
