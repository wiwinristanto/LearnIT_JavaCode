package com.learnIT.method.hw;

import java.util.Scanner;

public class FirstCharCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter any text: ");
		String userInput =sc.next();
		
		System.out.println(firstCharToTitleCase(userInput));
		

	}

	public static String firstCharToTitleCase(String string) {
		// TODO Auto-generated method stub
		char[] chars = string.toLowerCase().toCharArray();
		boolean found = false;
		
		for (int i = 0; i < chars.length; i++) {
			if (!found && Character.isLetter(chars[i])) {
				chars[i] = Character.toUpperCase(chars[i]);
				found = true;
			}else if (Character.isWhitespace(chars[i])) {
				found = false;
			}
		}
		return String.valueOf(chars);
	}

}
