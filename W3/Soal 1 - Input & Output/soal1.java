package com.tugas;

// Mengimpor kelas
import java.util.Scanner;
import java.util.StringTokenizer;

public class soal1 {
	
	// Ada perbedaan dengan spesifikasi yang diberikan
	
	public static void main(String[] args) {

		// Mengambil inputan dari user
		Scanner in = new Scanner(System.in);
		System.out.println("Input: ");
		String str = in.nextLine();
		
		// Membuat objek class StringTokenizer 
		StringTokenizer strTokens;
		strTokens = new StringTokenizer(str);
		
		System.out.println("\nOutput :");
		// strTokens.countTokens untuk menghitung jumlah token/kata
		System.out.println(strTokens.countTokens());
		// Perulangan untuk menampilkan tiap token
		// strTokens.hasMoreTokens untuk mengecek apakah masih ada token atau tidak
		while(strTokens.hasMoreTokens()) {
			System.out.println(strTokens.nextToken());
		}
	}
}
