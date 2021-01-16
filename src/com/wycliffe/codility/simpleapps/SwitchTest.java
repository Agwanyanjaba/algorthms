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
public class SwitchTest {
    static String grade;
    public static  String returnGrade(int marks){
        switch(marks)
        {
            case 90:
                    grade = "A";
                    System.out.println(">>"+marks);
                    break;
            case 80:
            case 71:
                    grade = "B";
                    System.out.println(">>"+marks);
                    break;
            case 70:
            case 60:
                    grade = "C";
                    System.out.println(">>"+marks);
                    break;
            default:
                System.out.println(">>"+marks);
                grade = "D";
        }
     return  grade;  
    }
    public static void main(String args[]){
        System.out.println("Grade is: "+returnGrade(71));
    }
    
}
