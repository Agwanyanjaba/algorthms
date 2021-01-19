/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility.simpleapps;

import java.util.Scanner;

/**
 *
 * @author WOCHIENG1
 */
public class GradeBook {
    String courseName;
    //constructor
    GradeBook(String name){
        courseName = name;
    }
    //set name method
    public void setName(String name){
        courseName = name;
    }
    public String getCourseName(){
        return courseName;
    }
    public double  determineAverage(){
        int total = 0; //initalize total
        int grade;
        int counter = 0; //initialize counter
        double average =0;
        int controller = 0;
        
        Scanner scaner = new Scanner(System.in);
        //promt usrr to key the number of students
        System.out.println("Key in the number of students:");
        controller = scaner.nextInt();
        
        //prompt user to key in the grades;
        while(counter<controller){
            System.out.println("Enter grade:");
            grade = scaner.nextInt();
            total = total + grade;
            counter = counter+1;
        }
        average = total/counter;
        System.out.println("Number of the grade is:"+counter+ ",and the total is"+total);
        System.out.println("Average of the class is:"+average);
        
        return average;
    }
    
    public void displayMessage(){
        System.out.println("Welcome  to:"+getCourseName());
        
    }
}
