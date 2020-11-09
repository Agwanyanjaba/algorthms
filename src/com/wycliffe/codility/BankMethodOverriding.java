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
class BankMethodOverriding {

    int getRateOfInterest() {
        return 10;
    }
}
//Creating child classes.  

class SBI extends BankMethodOverriding {

//    int getRateOfInterest() {
//        return 8;
//    }
}

class ICICI extends BankMethodOverriding {

    int getRateOfInterest() {
        return 7;
    }
}

class AXIS extends BankMethodOverriding {

    int getRateOfInterest() {
        return 9;
    }
}
//Test class to create objects and call the methods  

class Test2 {

    public static void main(String args[]) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
    }
}
