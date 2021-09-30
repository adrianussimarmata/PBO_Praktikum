package com.tugas;

public class soal7 {

	public static void main(String[] args) {
		
		// One Dimensional Arrays
		int[] firstArray = {2,5,3};
		int[] secondArray = {9,5,3};
		int[] thirdArray = {2,4,9};
		int[] fourthArray = {10,11,12};
		int[] fifthArray = {13,14,15};
		int[] sixthArray = {16,17,18};
		int[] seventhArray = {19,20,21};
		int[] eighthArray = {22,23,24};
		int[] ninthArray = {25,26,27};
		
		// Two Dimensional Arrays
		int[][] twoDimensionalArrays1 = {firstArray, secondArray, thirdArray};
		int[][] twoDimensionalArrays2 = {fourthArray, fifthArray, sixthArray};
		int[][] twoDimensionalArrays3 = {seventhArray, eighthArray, ninthArray};
		
		// Three Dimensional Arrays
		int[][][] threeDimensionalArray = {twoDimensionalArrays1, twoDimensionalArrays2, twoDimensionalArrays3};
			
		/* Menampilkan isi Array */
		byte i,j,k;
		
		System.out.println("Output :");
		for(i=0; i<threeDimensionalArray.length; i++) {
			System.out.print("{");
			for(j=0; j<threeDimensionalArray.length; j++) {
				System.out.print("{");
				for(k=0; k<threeDimensionalArray.length; k++) {
					System.out.printf("%d ", threeDimensionalArray[i][j][k]);
				}
				System.out.print("} ");
			}
			System.out.print("}\n");
		}
	}
}
