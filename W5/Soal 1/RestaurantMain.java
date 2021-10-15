package Soal1;

import java.util.Scanner;

public class RestaurantMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Restaurant menu = new Restaurant();
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Molen", 1_000, 20);
		Restaurant.nextId();	// tambahan agar molen bisa terbaca
		
		char confirm = 'Y';
		while(confirm == 'Y') {
			System.out.println("Menu makanan yang tersedia saat ini : ");
			menu.tampilMenuMakanan();
			
			// Input nama makanan
			System.out.print("\nMasukkan pesanan anda             : ");
			String pesan = input.next();
			
			// Input jumlah makanan
			System.out.print("Jumlah makanan yang ingin dipesan : ");
			short jumlah = input.nextShort();
			menu.pesanMakanan(pesan, jumlah);
			
			System.out.print("\nIngin memesan lagi (Y/T) : ");
			confirm = input.next().charAt(0);
			System.out.println("\n");
		}
	}
}