/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility;

import java.util.Arrays;

/**
 *
 * @author WOCHIENG1
 */
public class ArraysOperations {

    public int removeElement(int[] nums, int value) {
        if (nums.length == 0) {
            return 0;

        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != value) {
                nums[i] = nums[j];
                System.out.println("....."+nums[i]);
                i++;

            }
        }
        System.out.println("#####"+i);
//        for(int elements: nums){
//            System.out.println("<<<<<<"+nums[elements]);
//        }
        
        return i;
    }
    public int sumArrayElements(int[] nums1){
        int sum = 0;
        for(int i=0; i<nums1.length ; i++){
            sum += nums1[i];
            System.out.println(nums1[i]);
        }
        
        return sum;
        
    }
    public int[] reverseArray(int [] nums1){
        int [] arrayReversed = {};
        int j = nums1.length-2;
        //int i=0;
        for(int i=0; i<nums1.length; i++){
           
            arrayReversed[j] = nums1[i];
             j--;
        }
        return arrayReversed;
    }

    public static void main(String args[]) {
        int nums[] = {3,3,2,1};
        int nums1[] = {12,3,4,15};
        ArraysOperations object = new ArraysOperations();
        int numsLength = object.removeElement(nums, 3);
        System.out.println("+++++" + numsLength);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(">>>>" + nums[i]);
        }
        
        int sum=object.sumArrayElements(nums1);
        System.out.println("Sum is:" + sum);
        
        //output reversed array
        System.out.println("Reversed Array:"+Arrays.toString(object.reverseArray(nums1)));

    }
}
