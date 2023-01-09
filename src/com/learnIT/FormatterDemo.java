package com.learnIT;

import java.util.Formatter;

public class FormatterDemo {
	public static void main(String[] args) {
		//create Formatter class object
		Formatter formatter = new Formatter();
		
		//============Use Space format specifier
		System.out.println();
		System.out.println("========Space format specifier===");
		System.out.println();
		
		formatter.format("%d",-111);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("% d", 111);
		System.out.println(formatter);
		
		//Format 4 places.
		formatter = new Formatter();
		formatter.format("%.2f", 123.1234567);
		System.out.println("Decimal floating-point" + "  notation to 4 place :  " + formatter);
	}

}
