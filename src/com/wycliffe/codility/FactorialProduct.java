//@author wycliffe
package com.wycliffe.codility;


public class FactorialProduct {
    public static long fibonacciProduct(long number){
        if(number <= 1){ //base case
            return 1;
        }
        else
     return number * fibonacciProduct(number-1) ;   
    }
    public static long fibonacciSum(long number){
        if(number <= 1){ //base case
            return 1;
        }
        else
     return number + fibonacciSum(number-1) ;   
    }
    
    public static void main(String []args){
        int number = 10 ;
        for (int counter=0; counter<=21; counter++){
            //System.out.printf("%d = %d\n", counter, fibonacciProduct(counter));
            System.out.printf("Sum %d = %d\n", counter, fibonacciSum(counter));
        }
    }

}
