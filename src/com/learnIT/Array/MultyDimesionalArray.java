package com.learnIT.Array;

import java.beans.JavaBean;

public class MultyDimesionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java program to illustrate the use of multydimensional array
		int arr[][]= {{1,2,3},{2,1,3},{2,2,1}};
		//Print 2D array
		for (int i =0; i < arr.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	
	}
	
}
