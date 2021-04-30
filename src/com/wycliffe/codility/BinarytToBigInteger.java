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
import java.math.BigInteger;

public class BinarytToBigInteger {

	/**
	 * This java sample code shows how to convert a string input in binary
	 * format into a BigInteger
	 * Property of javatutorialhq.com
	 * You are free to modify on your own personal use
	 * All Rights Reserved
	 * Version 1.0
	 * 07/24/2013
	 */

	public static void main(String[] args) {
		String binaryString = "1010110101011";
		try {
			BigInteger bigNumber = new BigInteger(binaryString, 2);
			System.out.println("BigNumber is: " + bigNumber);
		} catch (NumberFormatException ne) {
			System.out.println("Binary input is invalid");
			ne.printStackTrace();
		}

	}

}