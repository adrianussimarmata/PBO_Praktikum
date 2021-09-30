package com.tugas;

// Mengimpor kelas
import java.util.Scanner;
import java.text.DecimalFormat;

public class soal2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Mendeklarasikan array
		String[] kata = new String[3];
		String[] output = new String[3];
		short[] angka = new short[3];
		
		System.out.println("Input :");
		
		byte i;
		for(i=0; i<kata.length; i++) {
			String str = input.next();
			kata[i] = str;	
			short number = input.nextShort();
			angka[i] = number;
			String pattern = "000";
			DecimalFormat myFormatter = new DecimalFormat(pattern);
			output[i] = myFormatter.format(angka[i]);
		}
	
		// Print Output
		System.out.println("\nOutput :");
		System.out.println("================================");
		for (i=0; i<3; i++) {
			System.out.printf("%-14s %s\n", kata[i], output[i]);
		}
		System.out.println("================================");
	}
}
