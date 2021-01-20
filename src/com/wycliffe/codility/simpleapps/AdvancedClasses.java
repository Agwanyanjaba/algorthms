/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility.simpleapps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author WOCHIENG1
 */
public class AdvancedClasses {

    static private AdvancedClasses object;
    static private AdvancedClasses object2;
    private String sname;
    protected int age;
    private static ArrayList list = new ArrayList<>();

    private AdvancedClasses() {
        //object = "45";
    }

    private AdvancedClasses(String name, int age) {
        this.sname = name;
        this.age = age;
    }

    public static void returnClassValues() {
        AdvancedClasses.object2 = new AdvancedClasses("Julius", 89);
        System.out.print(object2.age);
        System.out.print(object2.sname);
        list.add("Red");
        list.add("Blue");
    }

    //return list of cars as an object of ArrayList
    public static ArrayList returnCarsObject() {
        ArrayList carList = new ArrayList<>();
        carList.add("Porsche");
        carList.add("BMW");
        carList.add("Mercedece");
        carList.add("Tesla");
        return carList;
    }

    //pritn colours list
    public static void printList(ArrayList list1) {
        System.out.println();
        System.out.println(list);
        

    }
    
    //print cars list
    public static void printCarList(){
        ArrayList list = returnCarsObject();
        System.out.println();
        System.out.println(">>>"+list);
    }
    //let user enter a given index and print the car at that index
    public static int returnCarChoice(){
        Scanner sc = new Scanner(System.in);
        //Promt user to Key in the choice
        System.out.println("Enter the choice:");
        int choice = sc.nextInt();
        return choice;
    }
    
    //print user choice of car brand
     public static void printCarChoice(){
        int choice  = returnCarChoice();
        ArrayList list = returnCarsObject();
        System.out.println();
        System.out.println(">>>"+list.get(choice));
    }

    public static void main(String... vargs) {
        returnClassValues();
        printList(list);
        printCarList();
        printCarChoice();
    }
}
