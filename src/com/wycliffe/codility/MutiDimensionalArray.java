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
public class MutiDimensionalArray {
    public static void main(String args[]){
        int myArray [][] = {{1,5,7,2},{2,8,9,1,4,0,3}};
        
        System.out.println("First Element in second array "+myArray[1][0]);
        
        //Loop through the array for- loop
        for(int i=0; i<myArray.length; i++){
            for(int j=0; j<myArray[i].length; j++){
            System.out.println("Elements Are:"+myArray[i][j]);
        }
        }
        for(int[] i: myArray){
            //System.out.println("Elements Are:"+i);
        }
    }
    
}
