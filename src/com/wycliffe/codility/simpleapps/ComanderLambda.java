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
public class ComanderLambda {
    public static String solution(int i){
        String prime = getPrimeString();
        
        String sprime = prime.substring(i, i+5);
        System.out.println(">>>>"+sprime);
        return sprime;
    }
    //get prime string
    public static String getPrimeString(){
        String s ="";
        int prime  = 2;
        //add prime to string
        while(prime<10005){
            s += Integer.toString(prime);
            prime +=1;
            //check if prime
            if(!isPrime(prime)){
                prime +=2;
            }
        }
        return s;
    }
    //Test if prime
    public static boolean isPrime(int n){
        if(n%2 ==0){
            return false;
        }
        else if(n%3==0){
            return false;
        }
        else{
            System.out.println("+++++++"+n);
            return true;
        }
    }
    public static void main(String args[]){
        solution(0);
    }
    
}
