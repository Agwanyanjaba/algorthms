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
import java.util.HashSet;
public class HashSetsTest {
    public int returnHashSets(String string){
        HashSet<Character> myHashSet = new HashSet<>();
        //covert the string to array
//        for(int i =0;  i)
        
        char [] stringArray = string.toCharArray();
        for(int i=0; i<stringArray.length; i++){
            
        }
        System.out.print(stringArray.length);
        //test for characters in adjascent indices
        for(int i=0; i< stringArray.length-1; i++){
             myHashSet.add(stringArray[i]);
        }
       
        
        
//        myHashSet.add("Tripoli");
//        myHashSet.add("Tripoli");
//        myHashSet.add("Lagos");
//        myHashSet.add("Tripoli");
//        myHashSet.add("Lagos");
        
       //return myHashSet.toString();
        return myHashSet.size();
    }
    
    public static void main(String args[]){
        HashSetsTest hashSetObject = new HashSetsTest();
        //System.out.println("Cities are: " +hashSetObject.returnHashSets());
        
        //test longest substring of string with non repeating chracters
        String string = "Wycliffepara";
        System.out.println("Cities are: " +hashSetObject.returnHashSets(string));
        
        
    }
}
