package anurag;

import java.util.Scanner;

public class addMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows:");
		int rows = sc.nextInt();
		
		System.out.println("Enter number of colmns:");
		int cols = sc.nextInt();
		
		int[][] matrix1 = new int[rows][cols];
		int[][] matrix2 = new int[rows][cols];
		
		System.out.println("Enter the first matrix:");
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols; j++){
				matrix1[i][j] = sc.nextInt();
			}
		}
			
		System.out.println("Enter the second matrix:");
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols; j++){
				matrix2[i][j] = sc.nextInt();
			}
		}
			
//		int[][] ansMatrix = new int[rows][cols];
		System.out.println("Addition of the matrices is: ");
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols; j++){
//				ansMatrix[i][j] =
						System.out.print(matrix1[i][j] + matrix2[i][j] + " ");
			}System.out.println("");
		}
			
		
		
	}

}
