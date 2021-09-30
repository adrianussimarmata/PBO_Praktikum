package com.tugas;

// Mengimpor kelas
import java.util.Scanner;
import java.math.BigInteger;

public class soal6 {
	
	public static void main(String[] args) {
		
		// Mengambil inputan
		Scanner input = new Scanner(System.in);
		System.out.println("Input :");
		String strAngka1 = input.next();
		String strAngka2 = input.next();
		
		// Membuat bilangan BigInteger dari String
		BigInteger angka1 = new BigInteger(strAngka1);
		BigInteger angka2 = new BigInteger(strAngka2);
		
		// Print Output
		System.out.println("\nOutput :");
		System.out.println(angka1.add(angka2));			// Penjumlahan BigInteger
		System.out.println(angka1.multiply(angka2));	// Perkalian BigInteger
	}
}
