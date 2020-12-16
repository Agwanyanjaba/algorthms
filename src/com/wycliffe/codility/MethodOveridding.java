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
public class MethodOveridding {

    public void bark() {
        System.out.println("=========");
    }

}

class Dog extends MethodOveridding {

    public void bark() {
        System.out.println(">>>>>");
    }
}

class DriverTest {

    public static void main(String args[]) {
        MethodOveridding object = new Dog();
        object.bark();

    }
}
