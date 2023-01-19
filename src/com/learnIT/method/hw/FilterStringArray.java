package com.learnIT.method.hw;

import java.util.Arrays;
import java.util.Scanner;

public class FilterStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter any words separated bu space: ");
		String userInput = sc.nextLine();
		System.out.println("Please, enter minimum word length to filter words: ");
		int minLength = sc.nextInt();
		
		String[] words = userInput.split("\\s+");
		String[] filteredWord = filterWordsByLength(minLength, words);
		System.out.println(Arrays.toString(filteredWord));
	}

	private static String[] filterWordsByLength(int minLength, String[] words) {
		// TODO Auto-generated method stub
		String[] filteredArray = new String[words.length];
		for ( int i = 0; i < words.length; i++) {
			if(words[i].length() >= minLength) {
				filteredArray[i] = words [i];
			}
		}
		filteredArray = filterNulls(filteredArray);
		return filteredArray;
	}

	private static String[] filterNulls(String[] arr) {
		// TODO Auto-generated method stub
		int newArraySize = 0;
		for (String word : arr) {
			if (word != null) {
				newArraySize++;
			}
		}
		
		String[] filteredArray = new String[newArraySize];
		
		int filteredArrayIndex = 0;
		for (String word : arr) {
			if (word != null) {
				filteredArray[filteredArrayIndex++]=word;
			}
		}
		return filteredArray;
	}

}
