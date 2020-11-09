/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
1.Define the super class with an attribute to be extended
2. Define two classes to extend the attributes of the super class
3. In the two sub-classes define methods to overide the super class method
4. Define a driver class method
5. In the drver class, create objects of each subclass to implenent the respective methods of the subclasses. 

 */
package com.wycliffe.codility;

/**
 *
 * @author WOCHIENG1
 */
public class Polymorphism {

    //Attributes for a Programming Language
    String basicAttr = "Syntacx and Semantics";

    public void returnAttribute() {
        System.out.println("Language has:" + basicAttr+"\n");
    }

    static class JavaLang extends Polymorphism {

        public void returnAttribute() {
            System.out.println("Java Language supports Polymorphism and Inheritance: \n");
        }
    }

    static class PHP extends Polymorphism {

        public void returnAttribute() {
            System.out.println("PHP Language supports Server side scripting language: \n");
        }
    }
    
    public static void main(String args[]){
        Polymorphism polymorphObj = new Polymorphism();
        Polymorphism javaObject = new JavaLang();
        Polymorphism phpObject = new PHP();
        
        //Access method of the super class
        polymorphObj.returnAttribute();
        //Access methods of the subclasses
        javaObject.returnAttribute();
        phpObject.returnAttribute();
        
    }

}
