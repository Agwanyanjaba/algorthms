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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Arrays {
    static int [] arrValues = {4,2,6,9,1,0,7};
    static ArrayList<String> cars = new ArrayList<>();
  
    public static void main(String args[]){
        cars.add("Volvo");
        cars.add("Toyota");
        cars.add("Bugharti");
        
        Collections.sort(cars);
        System.out.println("Sorted List: "+cars);
        
        //use for-each to printeach car item
        for(String i:cars){
            System.out.println("Values"+i);
        }
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        System.out.println(s);
        
    }
}
