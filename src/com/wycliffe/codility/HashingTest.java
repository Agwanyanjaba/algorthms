/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility;

import java.util.Hashtable;

/**
 *
 * @author WOCHIENG1
 */
public class HashingTest {

    public static void main(String args[]) {
        Hashtable<Integer, Long> hash = new Hashtable<>();

        int arr[] = {20, 22, 19, 24, 25};
        for (int i = 0; i < arr.length; i++) {
            hash.put(i, hashUtil(arr[i]));
        }

        System.out.println("Hash Value" + hash);
    }

    public static long hashUtil(long value) {
        long hashValue = (value % 19);
        return hashValue;
    }

}
