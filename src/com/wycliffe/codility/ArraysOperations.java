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
public class ArraysOperations {

    public int removeElement(int[] nums, int value) {
        if (nums.length == 0) {
            return 0;

        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != value) {
                nums[i] = nums[j];
                i++;

            }
        }
        System.out.println("#####"+i);
        for(int elements: nums){
            System.out.println("<<<<<<"+nums[elements]);
        }
        
        return i;
    }

    public static void main(String args[]) {
        int nums[] = {3, 2, 2, 3};
        ArraysOperations object = new ArraysOperations();
        int numsLength = object.removeElement(nums, 3);
        System.out.println("+++++" + numsLength);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(">>>>" + nums[i]);
        }

    }
}
