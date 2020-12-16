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
import java.util.*;
import java.util.Arrays;

public class MergeArrays {

    public static List<Integer>  returnArrays(Integer[] arrayA, Integer [] arrayB) {
        //craete LinkedList Object
        List <Integer> list = new ArrayList<>();    
        //covert the arrays to arraylist
        list.addAll(Arrays.asList(arrayA));
        list.addAll(Arrays.asList(arrayB));     
        //looop through the arrays and add the arrays to list
        return list;
    }
    public static void main(String args[]) {
        Integer [] arrayB = {1, 2, 3};
        Integer [] arrayA = {1, 2, 3, 5, 6, 6};
        
        List<Integer> list = returnArrays(arrayB,arrayA);
        System.out.println(list);
        
    }
}
//complexity is O(n+m);