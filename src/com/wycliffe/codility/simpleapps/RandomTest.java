/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility.simpleapps;

import java.util.Random;

/**
 *
 * @author WOCHIENG1
 */
public class RandomTest {

    //test if a number is prime bewteen 1-10
    public static void main(String args[]) {
        for (int i = 1; i <= 10; i++) {
            Random random = new Random();
            int number = random.nextInt(20);
            if(number%2 !=0 && number%3 !=0){
                System.out.print("Prime Random"+number+"\n");
            }
            System.out.println(">>>>>>>>>>>>>>>>>>");
            if(i%2 !=0 && i !=9){
                System.out.print("Prime"+i+"\n");
            }
        }
    }

}
