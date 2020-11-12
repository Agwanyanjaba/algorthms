//@author wycliffe
package safaricomcodility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LargestNumberDifference {

    int largestDifference(int arr[]) {
        ArrayList<Integer> diffList = new ArrayList<>();
        // if the array is not sorted. 
        Arrays.sort(arr);
        
        int largeDiff = 0;
        int i, diff = 0;
        
        for (i = 0; i < arr.length-1; i++) {
            
            diff = arr[i+1] - arr[i];

            diffList.add(diff);
            Collections.sort(diffList);
            System.out.print("Difference is" + diff + "\n");

            largeDiff = diffList.get(diffList.size() - 1);

        }
        return largeDiff;
    }

    /* Driver program to test above functions */
    public static void main(String[] args) {
        LargestNumberDifference maxdif = new LargestNumberDifference();
        //int arr[] = {0, 8, 1, 5, 4, 7, 2, 9, 0};
        int arr[] = {1, 3, 4, 5, 8, 9};
        System.out.println("Largest difference is " + maxdif.largestDifference(arr));
    }
}
