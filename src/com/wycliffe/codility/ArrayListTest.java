/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility;
import java.util.ArrayList;
/**
 *
 * @author WOCHIENG1
 */
public class ArrayListTest {
    
    
    public static void main(String args []){
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add(0,"Yellow");
        
        for(String i:list){
            System.out.println("Elements are:"+i);
        }
        for(int i=0; i<list.size(); i++){
            System.out.println("Elements are:"+list.get(i));
        }
        ArrayListTest arraylistObject = new ArrayListTest();
        System.out.print("Color status is:"+arraylistObject.checkIfPresent(list));
    }
    boolean checkIfPresent(ArrayList list){
        boolean status = list.contains("Red");
        
        return status;
    }
}
