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
//define the super class together with attributes
//Define the sublass and its attributes
//Access the super class attibutes via extend keyword
//Define driver class to show thw output
public class Inheritance {
    //define super class attributes
    String brand  = "Ford";
    String deriveType ="4WD";
    
static class Car extends Inheritance{
    String carModel = "Mustang 987";
    
    String displayModelName(){
        return carModel;
    }  
}
public static void main(String args[]){
       Car carObject = new Car();
       System.out.println("Car name: "+carObject.displayModelName()+"of brand"+carObject.brand+"and Wheel Drive of"+carObject.deriveType);
    }
    
}
