package com.learnIT.method.hw;

import java.util.Scanner;

import org.w3c.dom.Text;

public class AmountOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter any text: ");
		String inputUser = sc.nextLine();
		System.out.println(inputUser);
		
		int amountOfWords = getWordsOfAmount(inputUser);
		System.out.println("Amount of words in your text: " + amountOfWords);
	}

	private static int getWordsOfAmount(String text) {
		// TODO Auto-generated method stub
		return text.split("[\\p{P}\\s]+").length;
	}

}
