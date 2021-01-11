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
public class TDDHello {

    private String hello, world;

    /*
    Constructor
     */
    public TDDHello() {
        hello = "Hi";
        world = "Wycliffe";

    }

    public String formMessage() {
        String message = hello + " " + world;
        return message;

    }

    public static void main(String args[]) {
        TDDHello objectStr = new TDDHello();
        System.out.println(objectStr.formMessage());

    }
}
