package com.learnIT;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("masukan panjang A");
		double aSide = sc.nextDouble();
		
		System.out.println("masukan panjang B");
		double bSide = sc.nextDouble();
		
		System.out.println("masukan panjang c");
		double cSide = sc.nextDouble();
		System.out.println("");
		double p = (aSide + bSide + cSide)/2;
		System.out.println(p);
		double triangleArea = Math.sqrt(p * (p - aSide)*(p - bSide) * (p - cSide));
		
		System.out.println("Luas Area Triangle : " + triangleArea );

	}

}