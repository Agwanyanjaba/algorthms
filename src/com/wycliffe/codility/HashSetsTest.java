/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility;
import java.util.LinkedHashSet;

/**
 *
 * @author WOCHIENG1
 */
public class HashSetsTest {
    public int returnHashSets(String string){
        LinkedHashSet<Character> myHashSet = new LinkedHashSet<>();
 
        int counter = 1;
        char [] stringArray = string.toCharArray();
        for(int i=0; i<stringArray.length; i++){
             System.out.print(stringArray[i]);
             
             
             if(stringArray[i+1]==stringArray[i]){
                 return counter;
             }
             counter ++; 
             System.out.println(counter+"\n");
        }
        System.out.println("\n");
        //System.out.print(stringArray.length);
        //test for characters in adjascent indices
        //        for(int i=0; i< stringArray.length-1; i++){
        //             myHashSet.add(stringArray[i]);
        //        }



        //        myHashSet.add("Tripoli");
        //        myHashSet.add("Tripoli");
        //        myHashSet.add("Lagos");
        //        myHashSet.add("Tripoli");
        //        myHashSet.add("Lagos");
       System.out.println("Counter Value"+counter);
       return counter;
        //return myHashSet.size();
    }
    
    public static void main(String args[]){
        HashSetsTest hashSetObject = new HashSetsTest();
        //System.out.println("Cities are: " +hashSetObject.returnHashSets());
        
        //test longest substring of string with non repeating chracters
        String string = "NumberOfArraysPairs";
        System.out.println("Length of Longest Substring is: " +hashSetObject.returnHashSets(string));
        
        
    }
}
