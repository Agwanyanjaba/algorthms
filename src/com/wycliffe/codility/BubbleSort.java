//@author wycliffe
package com.wycliffe.codility;

public class BubbleSort {

    public void sortArray(int array[]) {
        int temp;
        for (int i = 0; i < array.length-1; i++) {//Original length
            for(int j = 0; j<array.length-i-1; j++){//Index has moved
                if(array[j]>array[j+1]){
                    // swap arr[j+1] and arr[j] 
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                }
            }
        }
    }
    public void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(">>>>"+arr[i]);
        }
    }
    
    //Drive code
    public static void main(String []args){
        //Declare an array 
        int array [] = {2,7,1,3,8,0};
        //Create Object of the class
        
        BubbleSort myObject = new BubbleSort();
        myObject.sortArray(array);
        myObject.printArray(array);
    }
}
