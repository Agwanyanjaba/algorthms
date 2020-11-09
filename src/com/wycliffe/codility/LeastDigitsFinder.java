//@author wycliffe
package com.wycliffe.codility;

import java.util.Scanner;

public class LeastDigitsFinder {
    //vairiable declarations

    public static void main(String args[]) {
        long userDigit; //Any integer N of any length
        //int number = 0; //Intialization of least number for integer N
        //Read input from user:
        Scanner input = new Scanner(System.in);
        //Prompt user to key in the number:
        System.out.printf("Please Enter the Integer N between 1 - 10^9: %n");
        userDigit = input.nextLong();

        leastNumber((int)userDigit);
//        int[] arr = {1238, 45, 11888, 6, 7899899};

//        for(int i=0; i<arr.length; i++){
//            System.out.println("int: "+arr[i]+" :"+leastNumber(arr[i]));
//        }
    }

    public static long leastNumber(int userDigit) {

        final int MIN_VALUE = 1;
        final int MAX_VALUE = (int) Math.pow(10, 9);

        //Chek if N is > 0 and <= 10^9
        if (userDigit > MAX_VALUE || userDigit < MIN_VALUE) {
            System.out.printf("The least number is invalid: %d%n", userDigit);
            return userDigit;
        } else {

            //Pass the value of the integer to the leastNumber Method 
            //leastNumber(userDigit);
            int number = 0;
            int length; // length of the integer N

            String strNumber = Integer.toString(userDigit);
            System.out.printf("The length of the integer is: %s%n", strNumber.length());

            length = strNumber.length(); //To how java implements checking lenght of a string
            if (length > 1) {
                number = (int) Math.pow(10, length - 1);
            }
            System.out.printf("The least number is: %d%n", number);
            return number;
        }
    }
}
