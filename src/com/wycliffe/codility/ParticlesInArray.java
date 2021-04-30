/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

/**
 *
 * @author WOCHIENG1
 */
public class ParticlesInArray {
    public static void main(String[] args) {
	int[] arr = {-1, 1, 3, 3, 3, 2, 3, 2, 1, 0};
	System.out.println(countAllPeriods(arr));
	int[] arr1 = {1,2,3,4,5,6};
	System.out.println(countAllPeriods(arr1));
}

private static int countAllPeriods(int[] A) {
  
        //initialize the array
	int[] tempArray = new int[A.length];
       
	for(int i=1;i<A.length;i++) {
            if(A[i]>=-1000000000 && A[i]<=1000000000){
                tempArray[i] = A[i] - A[i-1];
            }
            else{
                return 0;
            }
		
                
	}
        
        //declare set size to hold pairs
	Set<List<Integer>> set = new HashSet<>();
	int tmp = 0, count = 0;
	for(;count<tempArray.length-1;count++) {
		tmp = count;
		while(tmp < tempArray.length-1 && tempArray[tmp] == tempArray[tmp+1]) {
			set.add(Arrays.asList(count, tmp+1));
			tmp++;
		}
	}
	return set.size();
}

//int ans = 0;
//    for (int i = 1; i < nums.length; i++) {
//        int length = 0;
//        int diff = nums[i] - nums[i - 1];
//        for (int j = i + 1; j < nums.length; j++) {
//            if (nums[j] - nums[j - 1] != diff) break;
//            length++;
//        }
//        ans += (length * (length + 1))/2;
//        i += length;
//    }
//    return ans;
}
