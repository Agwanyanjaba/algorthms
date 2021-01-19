/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility.simpleapps;

/**
 *
 * @author WOCHIENG1
 */
public class Primes {

    public static void main(String args[]) {
        solution(17);
    }

    public static String solution(int i) {
        String prime = getPrimeString();

        String sprime = prime.substring(i, i + 5);
        System.out.println(">>>>" + sprime);
        return sprime;
    }

    //get prime numbers add them to string
    //get prime string
    public static String getPrimeString() {
        String s = "2";
        int prime = 3;
        //add prime to string
        while (prime <= 10000) {

            //check if prime
            if (checkPrime(prime)) {
                s += Integer.toString(prime);
                prime += 1;
            }
            prime += 1;
        }
        //System.out.print(">>>>"+s);
        return s;
    }

    public static boolean checkPrime(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            //System.out.println(n + " is not prime number");
            return false;
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
                //return false;
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
                return true;
            }
        }//end of else
        return false;

    }
}
