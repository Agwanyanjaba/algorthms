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
<<<<<<< HEAD
import java.util.HashSet;

public class HashSetsTest {

    public int returnHashSets(String string) {
        HashSet<Character> myHashSet = new HashSet<>();
        //covert the string to array
//        for(int i =0;  i)

        char[] stringArray = string.toCharArray();
        for (int i = 0; i < stringArray.length; i++) {

=======
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
>>>>>>> 1a519d20a0236472d114bc9e45f313354e950fbd
        }
        System.out.println("\n");
        //System.out.print(stringArray.length);
        //test for characters in adjascent indices
<<<<<<< HEAD
        for (int i = 0; i < stringArray.length - 1; i++) {
            myHashSet.add(stringArray[i]);
        }

//        myHashSet.add("Tripoli");
//        myHashSet.add("Tripoli");
//        myHashSet.add("Lagos");
//        myHashSet.add("Tripoli");
//        myHashSet.add("Lagos");
        //return myHashSet.toString();
        return myHashSet.size();
=======
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
>>>>>>> 1a519d20a0236472d114bc9e45f313354e950fbd
    }

    public static void main(String args[]) {
        HashSetsTest hashSetObject = new HashSetsTest();
        //System.out.println("Cities are: " +hashSetObject.returnHashSets());

        //test longest substring of string with non repeating chracters
<<<<<<< HEAD
        String string = "Wycliffepara";
        System.out.println("Cities are: " + hashSetObject.returnHashSets(string));

=======
        String string = "NumberOfArraysPairs";
        System.out.println("Length of Longest Substring is: " +hashSetObject.returnHashSets(string));
        
        
>>>>>>> 1a519d20a0236472d114bc9e45f313354e950fbd
    }
}
