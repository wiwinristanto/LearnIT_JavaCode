package com.learnIT.method;

import java.util.Scanner;

public class FindMaxInArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {25, 12 ,7 ,75 ,56 ,100 , 56 , 122 , 56 ,121 , 150};
		int max = arr[0];
		for (int i=0; i<arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.println("Larges element present in given array: "  +max);
	}

}
