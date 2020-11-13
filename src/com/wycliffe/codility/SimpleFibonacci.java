//@author wycliffe
package com.wycliffe.codility;

//find the index of a fibonacci term
public class SimpleFibonacci {
    //define the fibonacci method
    public static int fibonacceTermFinder(int term){
        if(term==0){
          return 0;  
        }
        if(term == 1){
            return 1;
        }
        else{
            return fibonacceTermFinder(term -2)+fibonacceTermFinder(term-1);
        }
    }
    
    public static void main(String []args){
        int term = 10;
        System.out.println("Term is:"+fibonacceTermFinder(term));
    }
}
