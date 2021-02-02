//Algorithm Pseducode
/*
Generate the random numbers
    Crate Swap method to swap next smallest number with the number at the current index
    Assign current element to temporary
    Assign the smallest number to current index
    Assign temprary to current
    Sorting method with two for loops
        Loop through the array of length-1 while keeping the index of the first element in the unsorted array
        Loop though the array from the current position while looking for smallest element to swap
        Call swap method
    return the sorted array
 */
package algorithms.sorting;

import java.util.Random;

/**
 *
 * @author WOCHIENG1
 */
public class SelectionSort {

    private int data[];// Declare array
    private Random random = new Random();
    int smallest;

    //generate random numbers using the constructor
    public SelectionSort(int size) {
        //create space for the array
        data = new int[size];
        for (int i = 0; i < data.length; i++) {
            data[i] = 10 + random.nextInt(90);

        }

    }
//4,2
    //Swap method

    public void swap(int smallest, int current) {
        int temporary = 0;
        data[temporary] = data[current];
        data[current] = data[smallest];
        data[smallest] = data[temporary];
        
        
    }

    //method sort
    public int[] sort() {

        for (int i = 0; i < data.length; i++) {
            smallest = i;
            for (int j = i + 1; i < data.length - 1; j++) {
                if (data[j] < data[smallest]) {
                    smallest = j;
                    swap(i, smallest);
                }
            }

        }
        return data;
    }

    //Print the array
    public void printArray() {
        for (int i = 0; i < data.length; i++) {
            System.out.println(">>>" + data[i]);
        }
    }

    public static void main(String... vargs) {
        //@Override
        SelectionSort selection = new SelectionSort(8);
        selection.printArray();
        //System.out.println(selection.swap(78, 10));
    }

}
