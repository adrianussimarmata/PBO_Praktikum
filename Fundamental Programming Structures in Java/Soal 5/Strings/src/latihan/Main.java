package latihan;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// Deklarasi dan inisialisasi variabel
		String A = "hello";
		String B = "java";
		String compare, outputA, outputB;
		
		/*
		// Jika mengambil inputan dari user
		Scanner in = new Scanner(System.in);
		System.out.print("Masukkan kata pertama : ");
		A = in.next();
		
		System.out.print("Masukkan kata kedua   : ");
		B = in.next();
		*/
		
		// Membandingkan string
		if(A.compareTo(B) < 0) {
			compare = "No";
		} else if (A.compareTo(B) > 0) {
			compare = "Yes";
		} else {
			compare = "Equal";
		}
		
		outputA = A.substring(0,1).toUpperCase()+A.substring(1).toLowerCase();
		outputB = B.substring(0,1).toUpperCase()+B.substring(1).toLowerCase();
		// Print output
		System.out.println(A.length() + B.length());
		System.out.println(compare);
		System.out.println(outputA + " " + outputB);
	}
}
