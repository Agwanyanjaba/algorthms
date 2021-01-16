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
public class MultiDimentionalArray {

    public static void main(String args[]) {
        int[][] array = {{3, 4}, {5, 7}};
        System.out.println("Lenght" + array.length);
        for (int i = 0; i < array.length; i++) {
            for(int k=0; k<array.length; k++){
                System.out.println("Row0 Elements: " + array[k][i]);
            }

        }
//        for (int j = 0; j < array.length; j++) {
//            System.out.println("Row1 Elements: " + array[1][j]);
//        }
            int [] arr = {4,1,2,7,3,8,5,9,6};
            System.out.println("Elements are:");
            for(int element:arr){
                System.out.println(element);
            }
            //return max
            int max = arr[0];
            for(int element: arr){
                 if(max<element){
                     max = element;
                 }
            }
            System.out.println("Max is"+max);
           
    }

}
