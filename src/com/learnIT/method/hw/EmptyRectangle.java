package com.learnIT.method.hw;

import java.util.Scanner;

public class EmptyRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter height of rectangle: ");
		int height = sc.nextInt();
		System.out.print("Please, enter width of rectangle: ");
		int width = sc.nextInt();
		
		
		drawRectangkle(height, width);
	}

	private static void drawRectangkle(int height, int width) {
		// TODO Auto-generated method stub
		for (int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				if (j == 0 || j == width -1 || i == 0|| i == height - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
