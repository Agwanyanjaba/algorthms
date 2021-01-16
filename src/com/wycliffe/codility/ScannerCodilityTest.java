/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author WOCHIENG1
 */
public class ScannerCodilityTest {

    static String S = "city,temp2,temp\nParis,7,-3\nDubai,4,-4\nPorto,-1,-2";

    public int returnMax(String S, String C) {
        Scanner sc = new Scanner(System.in);
        String list1  ="";
        sc.useDelimiter("\\n");
        ArrayList list = new ArrayList();
        
        S = S.replaceAll("\n", ",");
        //to be continued
       
        System.out.println(S);
        return 0;
    }
    public static void main(String args[]){
        ScannerCodilityTest obj = new ScannerCodilityTest();
        obj.returnMax(S,"temp");
    }

}
