package com.Soal2;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
     
		Scanner input = new Scanner(System.in);
		char[] hexa = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		boolean ketemu = true;
		
		System.out.print("Masukkan nilai hexadecimal : ");
		String hex = input.next();
		
		try {
			for(int i=0; i<hex.length(); i++) {
				int j=0;
				while(j < hexa.length) {
					if(hex.charAt(i) == hexa[j]) {
						System.out.print(hex.charAt(i));
						ketemu = true;
						break;
					}
					else {
						ketemu = false;
					}
					j++;
				}
			}
			if(ketemu == false) {
				throw new MyException("Inputan bukan Hexadecimal");
			}
		}
		catch(MyException e) {
			System.err.println(e);
		}
	}
}

class MyException extends Exception {
    String str1;

    MyException(String str2) {
        str1 = str2;
    }

    public String toString() {
        return "Error: " + str1;
    }
}
