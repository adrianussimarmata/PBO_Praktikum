package latihan;

import java.util.Scanner;

public class dataTypes {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		if(in.hasNextLong() == true) {
			System.out.println("can be fitted in : ");
			if(in.hasNextByte() == true){
				System.out.println("* byte");
			} 
			
			if (in.hasNextShort() == true){
				System.out.println("* short");
			}
			
			if (in.hasNextInt() == true){
				System.out.println("* int");
			}
			
			if (in.hasNextLong() == true) {
				System.out.println("* long");
			}
		} else {
			System.out.println("can't be fitted anywhere");
		}
	}
}