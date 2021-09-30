package com.tugas;

// Mengimpor kelas
import java.util.Scanner;

public class soal4 {
	
	public static void main(String[] args) {
		
		// Konstanta
		final int gajiPokok = 500000;
		final int hargaItem = 50000;
		
		// Mengambil inputan dari user
		Scanner input = new Scanner(System.in);
		System.out.println("Input :");
		byte jmlItem = input.nextByte();
		
		// Menghitung bonus pendapatan
		double bonus;
		if(jmlItem > 80) {								// Jika penjualan di atas 80 item
			bonus = (hargaItem * jmlItem) * (0.35);
		} else if(jmlItem >= 40 && jmlItem <= 80) {		// Jika penjualan di rentang 40 - 80 item
			bonus = (hargaItem * jmlItem) * (0.25);
		} else if(jmlItem < 15) {						// Jika penjualan dibawah 15 item
			bonus = -1 * ((hargaItem * (15 - jmlItem)) * (0.15));
		} else {										// Jika penjualan selain kondisi diatas
			bonus = (hargaItem * jmlItem) * (0.1);
		}
		
		// Menghitung total gaji
		int gaji = (int) (gajiPokok + bonus);
		// Print gaji
		System.out.println("\nOutput :");
		System.out.println(gaji);
		
		
	}
}
