//@author wycliffe
package com.wycliffe.codility;

import java.util.Arrays;

public class MissingInteger {

    static int search(int ar[], int size) {
        int a = 0, b = size - 1;
        int mid = 0;
        Arrays.sort(ar);
        if (ar[0] < 0) {
            return 1;
        }
        while ((b - a) > 1) {
            mid = (a + b) / 2;
            if ((ar[a] - a) != (ar[mid] - mid)) {
                b = mid;

            } else if ((ar[b] - b) != (ar[mid] - mid)) {
                a = mid;
                System.out.println(">>>>>>>>>>"+ar[b]);
                System.out.println(">>MID>>>>>>>>"+mid);
            }

        }
        System.out.print(b + " " + mid);
        return (ar[mid] + 1);
    }

// Driver Code 
    public static void main(String[] args) {
        int ar[] = {8, 5, 2, 3, 4, 6};

        int size = ar.length;
        Arrays.sort(ar);
        System.out.println("Missing number: " + search(ar, size));

        for (int i = 0; i < size; i++) {
            System.out.println("Sorted array: " + ar[i]);
        }
    }

}
