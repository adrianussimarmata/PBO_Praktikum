package latihan;

public class FloatingPoint {
	public static void main(String[] args) {
		double x = 92.98;
// Math.round bertujuan untuk membulatkan nilai bilangan desimal ke bilangan bulat terdekat
		int nx = (int) Math.round(x);	// Penjelasan ada di buku core java hal 87
		System.out.println(nx);		// baris tambahan untuk menampilkan hasil
	}
}
