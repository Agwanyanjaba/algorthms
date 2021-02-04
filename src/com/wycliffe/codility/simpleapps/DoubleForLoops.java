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
public class DoubleForLoops {
    public static void main(String ... args){
        //single for loop
        for(int i=0; i<5; i++){
            System.out.println(">>>"+i);
        }
        System.out.println("___________________________________");
        for(int i=0; i<5; i++){
            System.out.println("###"+i);
            for(int j=i+1; j<5; j++){
            System.out.println("+++"+j);
        }
        }
    }
}
