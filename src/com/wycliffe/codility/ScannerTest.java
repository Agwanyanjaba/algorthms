/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility;

/**
 *
 * @author WOCHIENG1
 */
import java.util.Scanner;
public class ScannerTest {
    public static void main(String []args){
        System.out.print("Sum is: "+getUserInput());
    }
    
    public static int getUserInput(){
        int sum = 0;
        int firstNum, secondNum;
        Scanner myScannerObject = new Scanner(System.in);
        //Prompt user to key in first num
        System.out.print("Eneter First Number");
        firstNum = myScannerObject.nextInt();
        
        //Prompt user to key in second num
        System.out.print("Eneter Second Number");
        secondNum = myScannerObject.nextInt();
        
        sum  = firstNum + secondNum;
        return sum;
    }
    
}
