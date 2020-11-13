//@author wycliffe
package com.wycliffe.codility;
import java.util.Arrays;
//public class BinarySearchIteration {
//
//    static int myArray[] = {0, 10, 20, 40, 80, 90};
//
//    public static int search(int simpleArray[], int key) {
//        Arrays.sort(simpleArray);
//        System.out.print(simpleArray[3]);
//
//        int start = 0;
//        int location = -1;
//        int end = simpleArray.length - 1;
//        int middlePosition = (start + end + 1) / 2; //calcualte mid position of the array
//        //test if key is greater than mid position element
//        do {
//            // Check if x is present at mid
//            if (key == simpleArray[middlePosition]) {
//                location =  middlePosition;
//                return location;
//            }
//            //check if element is in left half
//            if (key < simpleArray[middlePosition]) {
//                end  = middlePosition - 1;
//                //return midPosition;
//            } //check if key is in right half
//            else {
//                start = middlePosition + 1;
//                //return midPosition;
//            }
//            middlePosition = (start + end +1);
//        }
//        while(start<=end&&location==-1);
//        
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int array[] = {0,10,20,4,8,9};//04891020
//        //int end = myArray.length - 1;
//        int key = 4;
//
//        //BinarySearchIteration ob = new BinarySearchIteration();
//        int result = BinarySearchIteration.search(array, key);
//        if (result == -1) {
//            System.out.println("Element not present");
//        } else {
//            System.out.println("Element found at index:" + result);
//        }
//    }
//}


// Java implementation of iterative Binary Search 
class BinarySearchIteration { 
    // Returns index of x if it is present in arr[], 
    // else return -1 
    int binarySearch(int arr[], int x) 
    { 
        int start = 0, end = arr.length - 1; 
        while (start <= end) { 
            int middle = (start + end + 1) / 2; 
  
            // Check if x is present at mid 
            if (arr[middle] == x) 
                return middle; 
  
            // If x greater, ignore left half 
            if (arr[middle] < x) 
                start = middle + 1; 
  
            // If x is smaller, ignore right half 
            else
                end = middle - 1; 
        } 
  
        // if we reach here, then element was 
        // not present 
        return -1; 
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearchIteration ob = new BinarySearchIteration(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 10; 
        int result = ob.binarySearch(arr, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at "
                               + "index " + result); 
    } 
} 
