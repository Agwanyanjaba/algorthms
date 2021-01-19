/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility.strings;

/**
 *
 * @author WOCHIENG1
 */
public class StringBuilderClass {

    protected static StringBuilder buffer2 = new StringBuilder("hello prof");

    //main method
    public static void main(String args[]) {
        printBuffers();
        printLength();
        returnCharAt();
        setCharAt();
        getChars();
        reverseBuilder();
    }

    public static void printBuffers() {
        StringBuilder buffer = new StringBuilder();
        StringBuilder buffer1 = new StringBuilder("10");

        StringBuilder buffer3 = new StringBuilder("");

        System.out.println(">>>>" + buffer1.toString());
        System.out.println(">>>>" + buffer1.length());
        System.out.println(">>>>" + buffer1.capacity());
    }

    public static void printLength() {
        StringBuilderClass object = new StringBuilderClass();
        System.out.println(">>>" + object.buffer2.capacity());
    }

    //method charAt() retuns char at specified index
    public static void returnCharAt() {
        System.out.println("*" + buffer2.charAt(0));
    }

    //method getChars() copies set of characters
    public static void getChars() {
        char chars[] = new char[buffer2.length()] ;
        buffer2.getChars(0, buffer2.length(), chars, 0);
        for(char character:  chars){
             System.out.println("**" + character);
        }
       
    }
    //method setCharAt replaces sepcified chas with desired chars
    public static void setCharAt(){
       try{
        buffer2.setCharAt(6,'P');
       buffer2.setCharAt(0,'H');
        System.out.println("***" + buffer2.toString());
       }
       catch(StringIndexOutOfBoundsException e){
           System.err.print("EROR??????"+e);
       }
    }
    //method reverse entire string
    public static void reverseBuilder() {
       buffer2.reverse();
        System.out.println("****" + buffer2.toString());
    }
    
}
