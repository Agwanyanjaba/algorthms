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
public class BinarySearch {

    public int solution(int[] A, int n) {
        int low = 0;
        int high = A.length - 1;
        int middle = (high + low + 1) / 2;
        int location = -1;
        do {

            if (n == A[middle]) {
                location = middle;
                System.out.print("<<<<<<"+location+"\n");
            } else if (n < A[middle]) {
                high = middle - 1;

            } else {
                low = middle + 1;
                System.out.print("?????"+low+"\n");
            }
            middle = (low + high + 1) / 2;
            System.out.print(">>>>>>"+middle+"\n");

        } while ((low <= high)&&(location==-1));

        return location;
    }

    public static void main(String... vargs) {
        int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int n = 78;
        BinarySearch object = new BinarySearch();
        int searchLocation = object.solution(A, n);
        System.out.println("Element found at:" + searchLocation);
    }
}
