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
public class MethodOverloading {

    static int additionMethod(int x, int y) {
        return x + y;
    }

    static double additionMethod(double x, double y) {
        return x + y;
    }

    public static void main(String args[]) {
        int sumOfInteger = additionMethod(3, 6);
        double sumOfDouble = additionMethod(2.5, 3.5);

        System.out.print("Sum of Int " + sumOfInteger + "\n");
        System.out.print("Sum of Double " + sumOfDouble + "\n");

    }

}
