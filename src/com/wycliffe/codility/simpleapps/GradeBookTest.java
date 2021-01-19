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
public class GradeBookTest {
    
    
    public static void main(String args[]){
        GradeBook gradebook = new GradeBook("ICS 2205: Algorithms 1");
        gradebook.displayMessage();
        gradebook.determineAverage();
        
    }
}
