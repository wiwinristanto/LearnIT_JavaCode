package com.learnIT.method.hw;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ArrayExtension {
	
	public static final int MULTIPLIER = 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter length of initial array: ");
		int baseArrayLenth = sc.nextInt();
		int[] arr = generateRandomArray(baseArrayLenth);
		int[] extendedArray = extendArray(arr);
		System.out.println("*** Initial array ***");
		System.out.println(Arrays.toString(arr));
		System.out.println("*** Extended array ***");
		System.out.println(Arrays.toString(extendedArray));

	}

	

	private static int[] extendArray(int[] arr) {
		// TODO Auto-generated method stub
		int newArrayLegth =arr.length * 2;
		int[] resultArray = Arrays.copyOf(arr, newArrayLegth);
		
		for (int i = arr.length; i < newArrayLegth; i++) {
			resultArray[i] = arr[i - arr.length] * MULTIPLIER;
		}
		return resultArray;
	}

	public static int[] generateRandomArray(int amountOfElements) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int[] resultArray = new int[amountOfElements];
		for (int i = 0; i < amountOfElements; i++) {
			resultArray[i] = r.nextInt(100) + 1;
		}
		return resultArray;
	}

}
