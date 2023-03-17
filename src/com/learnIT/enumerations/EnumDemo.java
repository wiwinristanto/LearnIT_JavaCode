package com.learnIT.enumerations;

import java.util.concurrent.PriorityBlockingQueue;

public class EnumDemo {
	
	EnumDemo(){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Priority priority = new Priority();
//		priority.apaAja();
		Month month = Month.APRIL;
		month.getDaysAmount();
		System.out.println(month);

	}

}
