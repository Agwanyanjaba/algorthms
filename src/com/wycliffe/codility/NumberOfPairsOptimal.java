//@author wycliffe
package com.wycliffe.codility;

import java.util.HashMap; 
import java.util.Map;

public class NumberOfPairsOptimal {

    public static int countPairs(int[] array, int arrayLength) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        //Find frequency of each element in the array
        for (int i = 0; i < arrayLength; i++) {
            if (hashMap.containsKey(array[i])) { //O(1)
                hashMap.put(array[i], hashMap.get(array[i])+1); //O(1)
                
            } else {
                hashMap.put(array[i], 1);////(0)(1)
            }
         }
        System.out.print(hashMap);
        int result = 0;
        //Calculate the number of pairs with equal values
        for (Map.Entry<Integer, Integer> iterator : hashMap.entrySet()) { //performance , read on iterator
            System.out.println("Key:"+iterator.getKey() + "Value:"+iterator.getValue());
            int count = iterator.getValue();
            result += (count * (count - 1)) / 2;
        }
        return result;
    }
    //Main method declaration
    public static void main(String args[]) {
        int[] array = new int[]{3, 5, 6,3,3, 5};
        //int[] array = {4,5,6,1,2,5,4,8,9,1,2,4,7,8,9,6,2,3,1,2,3,10};
        System.out.printf("Number of pairs:%d\n", countPairs(array, array.length));
    }
}//End class Number of Pairs
