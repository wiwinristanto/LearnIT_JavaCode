package com.learnIT.method.hw;

import java.util.Scanner;

public class SumDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Pleas, enter Integer: ");
		int number = sc.nextInt();
		
		int sumOfDigits = SumDigitsInNumber (number);
		System.out.println(sumOfDigits);

	}

	private static int SumDigitsInNumber(int number) {
		// TODO Auto-generated method stub
		int result = 0 ;
		while (number != 0) {
			result += number % 10;
			number /= 10;
		}
		return Math.abs(result);
	}

}
