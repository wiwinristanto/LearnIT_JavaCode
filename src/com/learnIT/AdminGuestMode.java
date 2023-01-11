package com.learnIT;

import java.util.Scanner;

public class AdminGuestMode {

	public static void main(String[] args) {
//		Implement console program which will meet the following requirements:
//
//			Program can be started in ‘admin’ and ‘guest’ mode
//
//			To start program in ‘admin’ mode any of multiple string arguments should be equal to ‘--admin’
//
//			To start program in ‘guest’ mode any of multiple string arguments should be equal to ‘--guest’
//
//			Program cannot be started with ‘--admin’ and ‘--guest’ arguments simultaneously
//
//			If program is started in ‘admin’ mode then "Hello, Admin!" is printed to console
//
//			If program is started in ‘guest’ mode then "Hello, Guest!" is printed to console
//
//			If program is started with ‘--admin’ and ‘--guest’ arguments then program prints "Please, select either 'ADMIN' or 'GUEST' mode for this program" to console

//		String start = String.join(",", args);;
//		String a = "--admin";
//		String g = "--guest";
//		
//		if (start != a && start != g) {
//			System.out.println("Please, select either 'ADMIN' or "
//					+ "'GUEST' mode for this program");
//		}else if (start == a && start != g) {
//			System.out.println("Hello, Admin!");
//		}else if (start != a && start == g) {
//			System.out.println("Hello, Guest!");
//		}

		String inputArguments = String.join(",", args);
		String adminFlag = "--admin";
		String guestFlag = "--guest";
		if (inputArguments.contains(adminFlag) && inputArguments.contains(guestFlag)) {
			System.out.println("Please, select either 'ADMIN' or "
					+ "'GUEST' mode for this program");
		} else if (inputArguments.contains(adminFlag)) {
			System.out.println("Hello, Admin!");
		} else if (inputArguments.contains(guestFlag)) {
			System.out.println("Hello, Guest!");
		}
	}

	}

