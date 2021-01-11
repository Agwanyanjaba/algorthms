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
public class SmallestInteger {

    static int solution(int N) {
        int sum = 0; //initialize sum

        //loop to divide integer N with base 10 while incrementing sum
        while (N != 0) {
            sum = sum + N % 10;
            N = N / 10;
        }
        return sum;
    }

/*Method to find the smallest
number whose sum of digits is also N
*/
    static void smallestNumber(int N) {
        int i = 1;
        while (1 != 0) {
            // Check if number has
            // sum of digits = N
            if (solution(i) == N) {
                System.out.print(i);
                break;
            }
            i++;
        }
    }

// Driver code
    public static void main(String[] args) {
        int N = 19;
        smallestNumber(N);
    }
}
