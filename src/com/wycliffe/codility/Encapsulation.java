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
public class Encapsulation {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    //Driver class
    public static void main(String rags[]){
        String myName = "John";
        Encapsulation myEncapObject = new Encapsulation();
        myEncapObject.setName(myName);
        System.out.println("Name is "+myEncapObject.getName());
    }
}
