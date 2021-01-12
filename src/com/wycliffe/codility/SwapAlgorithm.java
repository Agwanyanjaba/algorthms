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

/*

 */
public class SwapAlgorithm {

    static int[] array = {9, 1, 5, 4, 0};
    static int minPos;
    static int temp;

    public static void main(String[] args) {
        for (int i = 0; i < array.length - 1; i++) {
            minPos = i;//9
            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[minPos]) {
                    minPos = j;

                }

            }
            temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;

            //System.out.println(">>>>" + Array[i]);
        }
        int arr[] = {9, 1, 5, 4, 0};
        SwapAlgorithm obj = new SwapAlgorithm();
        obj.sort(arr);
        obj.printArray(array);

    }

    public void sort(int arr[]) {

        int n = arr.length;

        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array 
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;

            //System.out.print(arr[i]);
        }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
