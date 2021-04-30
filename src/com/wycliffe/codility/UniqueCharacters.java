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
// Java program to implement
// the above approach
import java.util.*;

class GFG {

// Function to find the minimum count of
// characters required to be deleted to make
// frequencies of all characters unique
    static int solution(String S) {
        //check range length of String if within range
        if(S.length()<1||S.length()>3*Math.pow(10, 5)){
            return 0;
        }
        //convert the string to char array
        char [] strArray = S.toCharArray();
        int length = S.length();
        // Stores frequency of each distinct character of string
        
        HashMap<Character, Integer> mp = new HashMap<>();

        // Store frequency of each distinct
        // character such that the largest
        // frequency is present at the top
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((x, y)
                        -> Integer.compare(y, x));

        // Stores minimum count of characters
        // required to be deleted to make
        // frequency of each character unique
        int countChars = 0;

        // Traverse the String
        for (int i = 0; i < length; i++) {
            // Update frequency of strArray[i]
            if (mp.containsKey(strArray[i])) {
                mp.put(strArray[i],mp.get(strArray[i]) + 1);
            } else {
                mp.put(strArray[i], 1);
            }
        }

        // Traverse the map
        for (Map.Entry<Character, Integer> it: mp.entrySet()) {
            // Insert current
            // frequency into priorityQueue
            priorityQueue.add(it.getValue());
        }

        // Traverse the priority_queue
        while (!priorityQueue.isEmpty()) {
            // Stores topmost
            // element of priorityQueue
            int frequent = priorityQueue.peek();

            // Pop the topmost element
            priorityQueue.remove();

            // If priorityQueue is empty
            if (priorityQueue.isEmpty()) {

                // Return chars count
                return countChars;
            }

            // If frequent and topmost
            // element of priorityQueue are equal
            if (frequent == priorityQueue.peek()) {
                // If frequency of the topmost
                // element is greater than 1
                if (frequent > 1) {
                    // Insert the decremented
                    // value of frequent
                    priorityQueue.add(frequent - 1);
                }

                // Update countChars
                countChars++;
            }
        }

        return countChars;
    }

// Driver Code
    public static void main(String[] args) {
        //String str = "abbbcccd";
        String str = "eeee";
  
        System.out.print(solution(str));
    }
}
