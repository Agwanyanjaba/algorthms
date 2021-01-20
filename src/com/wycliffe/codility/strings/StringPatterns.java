/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility.strings;

import java.util.Arrays;

/**
 *
 * @author WOCHIENG1
 */
public class StringPatterns {
    static String string = "city,temp2,temp\nParis,7,-3\nDubai,4,-4\nPorto,-1,-2";
    
    static String [] tokens = string.split("\n");
    static String str = Arrays.toString(tokens);
    
//    static String oBracket="[";
//    static String cBracket ="]";
//    static String str1 = str.replaceAll(oBracket, "");
//    static String strFial = str1.replaceAll(cBracket, "");
//    static String [] arrayTokens = strFial.split(",");
    
    
    public static void printTokens(){
        for(String string: tokens){
            System.out.println(">>>"+string);
            //arrayTokens = string.split(",");
            
           
        }
    }
    public static void crateArrayToken(){
        for(int i=0; i<tokens.length; i++){
             //arrayTokens[i] = string;
             String strElements = tokens[i];
             System.out.print(strElements);
             //
             
        }
    }
    public static void main(String...vargs){
        printTokens();
        crateArrayToken();
//        System.out.println("+++"+arrayTokens[arrayTokens.length-1]+"+++");
//        String srt = Arrays.toString(tokens);
//        System.out.println("****"+Arrays.toString(tokens));
//        System.out.println("===="+srt.charAt(1));
//        System.out.println("===="+arrayTokens[0]);
        
    }
    //convert 
    
}
