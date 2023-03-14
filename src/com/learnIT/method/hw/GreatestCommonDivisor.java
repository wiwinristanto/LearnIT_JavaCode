package com.learnIT.method.hw;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter two numbers separated by space : ");
		String userInput = sc.nextLine();
		
		String[] inputArgumentsArray = userInput.split("\\s+");
		int number1 = Integer.parseInt(inputArgumentsArray[0]);
		int number2 = Integer.parseInt(inputArgumentsArray[1]);
		
		System.out.println(gcdRecursive(number1, number2));

	}

	public static int gcdRecursive(int firstNumber, int secondNumber) {
		// TODO Auto-generated method stub
		if(secondNumber == 0) {
			//for the case firstNumber is negative
			return Math.abs(firstNumber);
		}else {
			return gcdRecursive(secondNumber, firstNumber % secondNumber);
		}
	}

}
