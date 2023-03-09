package com.learnIT.Array;

import javax.sql.rowset.JoinRowSet;

public class ArrayAnonymousMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		printArray(new int[] {10,22,44,66});
		
	}
	
	//Java program to demonstrade the way of passing anonmous array to method
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
//			System.out.println(arr[0]+ "a");
		}
	}

}
