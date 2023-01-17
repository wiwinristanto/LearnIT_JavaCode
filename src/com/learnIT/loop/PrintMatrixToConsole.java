package com.learnIT.loop;

public class PrintMatrixToConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
				{1, 2, 3, 4, 5,},
				{6, 7},
				{8, 9, 10},
				{7,5,3},
		};
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.err.print(matrix[i][j]+ " ");
			}
			System.out.println();
		}
		

	}

}
