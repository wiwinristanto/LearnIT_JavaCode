package com.learnIT.enumerations;

import java.util.Scanner;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.logging.Handler;

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukan nilai yg sesuai dengan HIGH/MEDIUM/LOW : ");
		Priority priority = Priority.valueOf(sc.next());
		
		
		
		switch (priority) {
		case HIGH:
			System.out.println("High priority");
			break;
		case MEDIUM:
			System.out.println("Medium priority");
			break;
		case LOW:
			System.out.println("Low priority");
			break;
		}
		
		System.out.println("======= Enum valueOf()");
		
		Priority priority2 = priority.valueOf("HIGH");
		System.out.println(priority2);

		//priority2 = Priority.valueOf("high"); 
		// java.lang.IllegalArgumentException: No enum constant 
		//com.itbulls.learnit.javacore.enumerations.Priority.high
		
		System.out.println("=========== Enum comparison");
		
		System.out.println("Priority.HIGH == Priority.MEDIUM: "
		+ (priority == Priority.MEDIUM)); //false
		
		System.out.println("Priority.HIGH == Priority.HIGH: "
		+ (priority == Priority.HIGH )); //true
		
		System.out.println("======== Enum ordinal()");
		
		System.out.println("Priority.HIGH.ordinal(): " + Priority.HIGH.ordinal());
		System.out.println("Priority.MEDIUM.ordinal(): " + Priority.MEDIUM.ordinal());
		
		System.out.println("========== Enum iteration");
		
		Priority[] values = Priority.values();
		for (Priority priority3 : values) {
			System.out.println(priority3);
		}
		
		System.out.println("======== Enum fields and methods");
		
		System.out.println("Month.JANUARI.getDaysAmount(): "+ Month.JANUARI.getDaysAmount());

	}

}
