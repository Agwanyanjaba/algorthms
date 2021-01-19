/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility.strings;

/**
 *
 * @author WOCHIENG1
 */
public class StringsManipulations {

    public static void main(String args[]) {
        String string = "abcdefghijklmabcdefghijklm";
        String s = new String("hello"); //parameterised constructor
        char[] charArray = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y', 's'};
        char[] charArray1 = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};

        //declare array of char
        char[] charArray2 = new char[5];
        //use the constructor
        String s1 = new String();
        String s2 = new String(s);
        String s3 = new String(charArray);
        String s4 = new String(charArray, 0, 5);

        System.out.printf(" S1=%s\n S2 = %s\n S3 = %s\n S4  = %s\n", s1, s2, s3, s4);

        //reverse string s
        for (int count = s.length() - 1; count >= 0; count--) {
            //System.out.printf("%c", charArray[count]) ;
            System.out.printf("%c", s.charAt(count));

        }
        System.out.println("\n" + s);
        //copy String s into charArray2
        System.out.println("The characters in the array are:");
        for (char character : charArray2) {
            s.getChars(0, 5, charArray2, 0);
            System.out.println(character);
            System.out.println();
        }
        //test of ternary operator
        int grade = 80;
        if (grade >= 60) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        //Ternary 
        System.out.println(grade >= 60 ? "Passed" : "Failed");
        
        //call String manipulation methods
        StringsManipulations.substringFinder(string);
        lastIndexOfChar(string);
        indexofChar(string);
        System.out.println(">>>"+String.valueOf(charArray1));

    }

    public static String substringFinder(String string) {
        string  = string.substring(0, 3);
        System.out.println(">>>>>"+string);
        return string;
    }

    //last index of character;
    public static int lastIndexOfChar(String string) {
        int lastIndex = string.lastIndexOf("m");//Return -1 if the charcter is not found in the string
        System.out.println("Last Index>>>"+lastIndex);
        return lastIndex;
    }

    //Index of character;
    public static int indexofChar(String string) {
        int index = string.indexOf('c');
        System.out.println("Index of>>>" + index);
        return index;
    }

}
