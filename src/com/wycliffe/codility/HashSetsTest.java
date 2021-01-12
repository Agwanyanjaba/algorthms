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
import java.util.HashSet;

public class HashSetsTest {

    public String returnHashSets(String string) {
        HashSet<String> myHashSet = new HashSet<>();
       
        myHashSet.add("Tripoli");
        myHashSet.add("Tripoli");
        myHashSet.add("Lagos");
        myHashSet.add("Tripoli");
        myHashSet.add("Lagos");
        return myHashSet.toString();
    } 


    public int returnLinkedHashSets(String string) {
        LinkedHashSet<Character> myLinkedHashSet = new LinkedHashSet<>();

        int counter = 1;
        char[] stringArray = string.toCharArray();
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i]);

            if (stringArray[i + 1] == stringArray[i]) {
                return counter;
            }
            counter++;
            System.out.println(counter + "\n");

        }
        System.out.println("\n");
        //System.out.print(stringArray.length);
        //test for characters in adjascent indices
        System.out.println("Counter Value" + counter);
        return counter;
    }

    public static void main(String args[]) {
        HashSetsTest hashSetObject = new HashSetsTest();
        //System.out.println("Cities are: " +hashSetObject.returnHashSets());

        //test longest substring of string with non repeating chracters
        String string = "Wyclifffepara";
        System.out.println("Cities are: " + hashSetObject.returnHashSets(string));

        String string1 = "NumberOfArrrraysPairs";
        System.out.println("Length of Longest Substring is: " + hashSetObject.returnLinkedHashSets(string));

    }


}
