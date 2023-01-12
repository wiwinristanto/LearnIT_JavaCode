package com.learnIT;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Silahkan masukan nama siswa : ");
		Scanner sc = new Scanner (System.in);
		String Input = sc.next();
		 switch (Input) {
		case "agus":
			System.out.println("Halo namaku agus");
			break;
		case "amin":
			System.out.println("Hallo namaku amin");
		default:
			System.out.println(Input + " tidak hadir");
			break;
		}
		 System.out.println("Program Selesai");
	}

}
