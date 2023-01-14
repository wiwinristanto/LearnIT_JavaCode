package com.learnIT.loop;

import java.util.Scanner;

public class NewLineForDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Implement console program which will meet the following requirements:
//
//			Program starts and asks user to enter integer number
//
//			Program prints each digit from the new line
//
//			EXAMPLE:
//			User input: “12345”
//
//			Program console output:
//
//		          1
//
//			      2
//
//			      3
//
//			      4
//
//			      5
		
		System.out.print("Please, enter any integer: ");
		Scanner sc = new Scanner(System.in);
		String intString = sc.next();
		for (char digit : intString.toCharArray()) {
			System.out.println(digit);
		}
	}

}
