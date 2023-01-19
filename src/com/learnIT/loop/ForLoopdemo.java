package com.learnIT.loop;

import java.text.Format;

public class ForLoopdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Format format loop
//		for (initiasi nilai; kondisi; step nilai) {
//			aksi
//		}
		
		System.out.println("for loop program pertama ");
		for(int nilai = 0; nilai <= 10; nilai++) {
			System.out.println("Nilai ke : " + nilai);
		}
		
		System.out.println("for loop program kedua ");
		for(int nilai = 0; nilai < 10; nilai++) {
			System.out.println("Nilai ke : " + nilai);
		}
		
		System.out.println("Program selesai");
	}

}
