package com.learnIT.method.hw;

import java.util.Iterator;

public class GenerateMatrix {

	public static int[][] main(String[] args) {
		// TODO Auto-generated method stub
		int [][]matrix = new int [3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j]=i*j;
			}
		}
		return matrix;
	}
}
