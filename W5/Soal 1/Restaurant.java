package Soal1;

public class Restaurant {
	
	private String[] nama_makanan;
	private double[] harga_makanan;
	private int[] stok;
	private static byte id = 0;
	
	public Restaurant() {
		nama_makanan = new String[10];
		harga_makanan = new double[10];
		stok = new int[10];
	}
	
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		this.nama_makanan[id] = nama;
		this.harga_makanan[id] = harga;
		this.stok[id] = stok;
	}
	
	public void tampilMenuMakanan() {
		for(int i=0; i<=id; i++) {
			if(!isOutOfStock(i)) {
				System.out.println(nama_makanan[i] + "[" + stok[i] + "]" + "\tRp. " + harga_makanan[i]);
			}
		}
	}
	
	public boolean isOutOfStock(int id) {
		if(stok[id] == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void nextId() {
		id++;
	}
	
	// Pemesanan makanan
	public void pesanMakanan(String nama_pesanan, short jmlPesanan) {
		byte a = 0;
		while (a != id) {
			if(nama_makanan[a].equals(nama_pesanan)) {
				if(jmlPesanan > stok[a]) {
					System.out.println("Stok " + nama_pesanan + " yang tersedia tidak mencukupi pesanan anda");
				} else if(!isOutOfStock(a)) {
					stok[a] -= jmlPesanan;
					System.out.println("Pesanan " + nama_pesanan + " anda sedang diproses.");
				} else {
					System.out.println("Maaf, stok " + nama_pesanan + " sedang kosong, silahkan pesan menu yang lain");
				}
				return;
			}
			a++;
		}
		if(a == id) {
			System.out.println("Makanan yang anda pesan tidak tersedia, silahkan pesan menu yang lain");
		}
	}
}
