package com.wycliffe.codility;

/**
 *
 * @author WOCHIENG1
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arrays {

    static int[] arrValues = {1};
    static int[] arrValuesTest = {1};
    static ArrayList<String> cars = new ArrayList<>();

    public static int[] reverseArray(int[] Arr) {
        int j = Arr.length;
        int ArrTemp[] = new int[j];
        for (int i = 0; i < Arr.length; i++) {
            ArrTemp[i] = Arr[j - 1];

            j--;
        }
        return ArrTemp;
    }

    //method to print an Array
    public static void printArray(int[] arr) {
        System.out.println("\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    //function to rotate last element of the array
    public static int[] rotateLastElement(int[] arr) {
        int tempArray[] = new int[arr.length];
        int last = arr[arr.length-1];
        for (int i = arr.length - 2; i>=0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = last;
        return arr;
    }

    //rotate array k number of times
    public static int[] shiftArray(int[] arr1, int K) {
        if(arr1.length<=1){
            return arr1;
        }
        int shiftedArray[] = new int[arr1.length];
        for (int i = 0; i < K; i++) {
            shiftedArray = rotateLastElement(arr1);
        }
        return shiftedArray;
    }

    public static void main(String args[]) {
        cars.add("Volvo");
        cars.add("Toyota");
        cars.add("Bugharti");

        Collections.sort(cars);
        System.out.println("Sorted List: " + cars);

        //use for-each to print each car item
        for (String i : cars) {
            System.out.println("Values" + i);
        }

//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        
//        System.out.println(s);
        //Output the reversed array
        int currentArray[] = reverseArray(arrValues);
        int shiftedArray[] = rotateLastElement(arrValues);
        int k_shiftedArray[] = shiftArray(arrValuesTest, 3);
        
        System.out.println("START Reversed Array>>" );
        for (int i = 0; i < arrValues.length; i++) {
            System.out.println((currentArray[i]));

        }
         System.out.println("END Reversed Array>>" );
        System.out.println("START Last element rotated left**" );
        for (int i = 0; i < arrValues.length; i++) {
            System.out.println((shiftedArray[i]));
        }
        System.out.println("END Last element rotated left**" );
        
        System.out.println("START array rotated K times :::::::");
        for (int i = 0; i < arrValuesTest.length; i++) {
            System.out.println((k_shiftedArray[i]));
        }
        System.out.println("END array rotated K times ::::");

    }
}
