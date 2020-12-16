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
public class TwoDArrays {

    static int[][] arr = {{1, 0, 1, 0}, {1, 1, 0, 1}, {0, 1, 1, 0}};

    public static void main(String args[]) {
        //System.out.println(arr[0][2]);

        int counter = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
//                if(arr[row][col]==arr[row+1][col+1]){
//                    counter++;
//                }
                System.out.print(arr[row][col]+" ");

            }
            //System.out.println(counter);
            System.out.println("\n");
        }
    }

}
