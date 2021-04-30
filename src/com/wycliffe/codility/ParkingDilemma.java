/*
 There are many cars parked in a parking lot. 
 The parking lot is  a straight line wwith a parkig spot ffor every meter
 There are n cars and a roofer wants to cover them with a roof
 Requirement is that, at least K cars currently in the lot are covered by roof. 
 */
package com.wycliffe.codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author WOCHIENG1
 */
public class ParkingDilemma {

    public static long minimumRoofLength(List<Long> cars, int k) {
        //return (long)Math.PI;
        if (cars.size() < 1 || k < 0) {
            return 0;
        }

        long minRoofLength = Long.MAX_VALUE;
        Collections.sort(cars);
        for (int i = 0; i <= cars.size() - k; i++) {
            minRoofLength = Math.min(minRoofLength, (cars.get(i + k - 1) - (cars.get(i))));
        }
        return minRoofLength + 1;

    }

    public static int minRoofLength(int[] arr, int k) {
        if (arr.length < 1 || k < 0) {
            return 0;
        }
        Arrays.sort(arr);
        int start = 0;
        int minRoofLength = Integer.MAX_VALUE;
        for (int end = 0; end < arr.length; end++) {
            if (end < k - 1) {
                continue;
            }
            int currentRoofLength = arr[end] - arr[start++] + 1;
            minRoofLength = Math.min(minRoofLength, currentRoofLength);
        }
        return minRoofLength;
    }

    public static void main(String... args) {
        List<Long> list = new ArrayList<>();
        list.add(1l);
        list.add(2l);
        list.add(3l);
        list.add(10l);


        
        //int [] arr = {2,10,8,17};
        int [] arr = {1,2,3,10};
        
        System.out.println(minimumRoofLength(list, 3));
        System.out.println(minRoofLength(arr, 3));
    }

}
