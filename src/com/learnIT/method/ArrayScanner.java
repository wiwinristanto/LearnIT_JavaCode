package com.learnIT.method;

import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to store: ");
		n = sc.nextInt();
		//create an array in the memory of the length 10
		int[] array = new int[n];
		System.out.println("Enter the Elemens of the array: ");
		for(int i = 0; i < n; i++) {
			//reading array elements from the user
			array[i]=sc.nextInt();
		}
		System.out.println("Array elements are : ");
		//accessing array elements using the for loop
		for (int i = 0; i < n; i++) {
			System.out.print(array[i]+" ");
		}
		
	}

}
