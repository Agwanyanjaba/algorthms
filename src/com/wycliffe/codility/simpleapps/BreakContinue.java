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
public class BreakContinue {
    public static void main(String args[]){
        //test break
        for(int i=0; i<=10; i++){
            if(i==5){
                break;
            }
            System.out.println("Numbers are:"+i);
        }
        System.out.println();
        //test continue
        for(int i=0; i<=10; i++){
            if(i==5){
                continue;
            }
            System.out.println("Numbers are:"+i);
        }
        System.out.println("Skipped Number 5");
    }
}
