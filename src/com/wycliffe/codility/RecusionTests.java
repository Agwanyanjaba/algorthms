//@author wycliffe
package com.wycliffe.codility;

public class RecusionTests {

    public static int sumFactorial(int v) {
        System.out.println(v);
        if (v > 0) {
            int sum = v + sumFactorial(v - 1);
            return sum;
        } else {
            return 1;
        }
    }

    //return n!

    public static int factorial(int n) {
        //define base case
        if(n>0){
            return n * factorial(n - 1);
        }
        else
        {
            return 1;
        }
    }

    public static void main(String[] args) {
        int n = 48888889;
        int sum = sumFactorial(n);
        int fact = factorial(n);
        System.out.println("Sum is" + sum);
        //System.out.println("factorial is" + fact);
    }

}
