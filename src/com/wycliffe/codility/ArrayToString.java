/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility;

import java.util.Arrays;
import java.lang.StringBuilder;

/**
 *
 * @author WOCHIENG1
 */
public class ArrayToString {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder sbf = new StringBuilder();
        for (String word11 : word1) {
            sbf.append(word11);
        }
        System.out.println("****" + sbf);

        StringBuilder sbf1 = new StringBuilder();
        for (String word21 : word2) {
            sbf1.append(word21);
        }
        System.out.println(">>>>" + sbf1);

        System.out.println(sbf + ">>" + sbf1);
        return sbf.toString().equals(sbf1.toString());
//        String string1 = Arrays.toString(word1);
//        String string2 = Arrays.toString(word2);
//
//        if (string1.equals(string2)) {
//            return true;
//        } else {
//            return false;
//        }
    }

    public static void main(String args[]) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bcd"};
        System.out.println(ArrayToString.arrayStringsAreEqual(word1, word2));
    }
}
