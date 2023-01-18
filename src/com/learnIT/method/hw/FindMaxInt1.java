package com.learnIT.method.hw;

import java.security.PublicKey;
import java.util.Scanner;

import com.learnIT.method.FindMaxInArrayDemo;

public class FindMaxInt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter integer numbers separated by space: ");
		int i = sc.nextInt();
		int[] max = new int[i];
		System.out.println("input array: ");
		int maz = 0;
		for (int a = 0;  a < i; a++) {
			max[a]=sc.nextInt();
			if(max[a] > i)
				maz = max[a];
		}
		System.out.print("Array elements are: "+ maz);
//		for ( int a = 0; a < i; a++) {
//			System.out.println(max[a]+" ");
//		}
//		
		
	}

//	private static int findMaxIntInArray(int[] intArray) {
//		 TODO Auto-generated method stub
//		for (int a = 0; a < intArray.length; intArray++ ) {
//			if (intArray[a] > intArray[0])
//				intArray = intArray[a];
//		}
//		return null;
//	}


}
