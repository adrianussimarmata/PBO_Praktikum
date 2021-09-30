package com.tugas;

// Mengimpor kelas
import java.util.Scanner;

public class soal5 {

	// Ada perbedaan dengan spesifikasi yang diberikan 
	
	public static void main(String[] args) {
		
		// Mengambil inputan
		Scanner input = new Scanner(System.in);
		System.out.println("Input :");
		String plat1 = input.next();
		String plat2 = input.next();
		String plat3 = input.next();
		String plat4 = input.next();
		
		// Menggabungkan string
		String gabungan = plat1 + plat2 + plat3 + plat4;
		// Mengkonversi string ke tipe data long
		long angka = Long.parseLong(gabungan);
		
		System.out.println("\nOutput :");
		// Pengecekan hasil dan print output
		if((angka - 999999) % 5 != 0) {		
			System.out.println("berhenti");
		} else {
			System.out.println("jalan");
		}
	}
}
