package Soal2;

public class Sasuke extends Itachi{

	String Dojutsu = "Sharingan";
	
	void printDojutsu() {
		super.printDojutsu();				// Menampilkan output dari method printDojutsu 
		System.out.println(this.Dojutsu);
	}
}
