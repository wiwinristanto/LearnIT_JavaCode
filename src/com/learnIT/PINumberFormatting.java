package com.learnIT;

import java.util.Formatter;

public class PINumberFormatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p = Math.PI;
		System.out.println(p);
		Formatter formatter = new Formatter();
		formatter.format("%.2f", Math.PI);
		System.out.println(formatter);
		formatter.format("%.3f", Math.PI);
		System.out.println(formatter);
		formatter.format("%.4f", Math.PI);
		System.out.println(formatter);
		formatter.format("%.5f", Math.PI);
		System.out.println(formatter);

	}

}
