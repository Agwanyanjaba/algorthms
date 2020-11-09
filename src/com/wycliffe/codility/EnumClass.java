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
/*
1. create Enum in class 
2. Use case to test the Enum
2. Create Driver Class to test the cases
 */


public class EnumClass {
    enum Level {
    Junior, Intermediate, Expert
}
    static Level myLevel = Level.Junior;
    public static void main(String args[]) {
        
        switch (myLevel) {
            case Junior:
                System.out.println("JUNIOR");
                break;
            case Intermediate:
                System.out.println("INTERMEDIATE");
                break;
            case Expert:
                System.out.println("EXPERT");
                break;
        }
        
        //lopp through the enum
        for(Level myLevel:Level.values()){
            System.out.println("Levels are:"+myLevel);
        }
    }

}
