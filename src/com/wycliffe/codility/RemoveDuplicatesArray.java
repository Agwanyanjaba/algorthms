/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility;

import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author WOCHIENG1
 */
public class RemoveDuplicatesArray {

    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        double upperLimit = Math.pow(10, 4);

        HashSet<Integer> mySets = new HashSet<>();
        //HashSet will handle unique values only
        if ((len >= 0) && (len <= upperLimit)) {
            for (int i = 0; i < nums.length; i++) {
                mySets.add(nums[i]);
            }
            
            Iterator it = mySets.iterator();
                while (it.hasNext()) {
                    System.out.println(it.next());
                }
            //using counter but sort the aarray first
            Arrays.sort(nums);
            //check if the adjacent element are equal
//        for(int i=0; i<nums.length; i++){
//            if(nums[i+1]==nu)
//        }

            return mySets.size();
        } else {
            return -1;
        }

    }

    public static void main(String args[]) {
        int arrayList[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newArraySize = removeDuplicates(arrayList);
        System.out.println(newArraySize);
    }
}
