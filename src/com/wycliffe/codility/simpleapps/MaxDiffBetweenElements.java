/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility.simpleapps;

/**
 *
 * @author WOCHIENG1
 */
public class MaxDiffBetweenElements {
    public int soulution(int [] blocks){
        Integer maxSum = null;
        int start;
        int maxDistance = 0;
        int i;
        if (blocks.length < 2) {
            return blocks.length;
        }
        i = 0;
        while (i < blocks.length - 1) {
            while ((i - 1 >= 0) && (i < blocks.length) && (blocks[i - 1] == blocks[i]))
                i--;
            start = i;
            int downSum = blocks[i];
            while ((i + 1 < blocks.length) && (blocks[i + 1] <= blocks[i])) {
                downSum += blocks[++i];
            }
            int upSum = 0;
            while ((i + 1 < blocks.length) && (blocks[i + 1] >= blocks[i])) {
                upSum += blocks[++i];
            }
            int sum = upSum + downSum;
            if ((maxSum == null) || (sum > maxSum)) {
                maxSum = sum;
                maxDistance = i - start + 1;
            }
        } 
        return maxDistance;
        
    }
    
    public static void main(String args[]){
        int [] arr = {1,1};
        MaxDiffBetweenElements object = new MaxDiffBetweenElements();
        
        int[] t = {2, 6, 8, 5};
        System.out.println(new MaxDiffBetweenElements().soulution(t));
        int[] t2 = {1,5,5,2,6};
        System.out.println(">>>>"+new MaxDiffBetweenElements().soulution(t2));
        
        
        int max = object.soulution(arr);
        System.out.println(">>>>>>"+max);
    }
}
