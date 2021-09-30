package com.tugas;

// Mengimpor kelas
import java.util.Scanner;

public class soal3 {
	
	public static void main(String[] args) {
		
		// Mengambil inputan dari user
		Scanner input = new Scanner(System.in);
		System.out.println("Input :");
		short operand1 = input.nextShort();
		String operator = input.next();
		short operand2 = input.nextShort();
		
		// Deklarasi dan inisialisasi operator
		String tambah = "+";
		String kurang = "-";
		String kali = "*";
		String bagi = "/";
		String modulus = "%";
		
		// Mengecek operator dan menampilkan output
		System.out.println("\nOutput :");
		if(operator.equals(tambah)) {
			System.out.println(operand1 + operand2);
		} else if(operator.equals(kurang)) {
			System.out.println(operand1 - operand2);
		} else if(operator.equals(kali)) {
			System.out.println(operand1 * operand2);
		} else if(operator.equals(bagi)) {
			System.out.println(operand1 / operand2);
		} else if(operator.equals(modulus)) {
			System.out.println(operand1 % operand2);
		} else {
			System.out.println("Tidak ditemukan operasi bilangan");
		}
	}
}
