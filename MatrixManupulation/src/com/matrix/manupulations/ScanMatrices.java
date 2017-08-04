package com.matrix.manupulations;

import java.util.Scanner;

public class ScanMatrices {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Scanner scan = new Scanner(System.in);
		
		//scanning rows and columns for Matrix 1
		System.out.println("Enter no of rows for Matrix 1");
		int row1= scan.nextInt();
		System.out.println("Enter no of Columns for Matrix 1");
		int column1 = scan.nextInt();
		
		//scanning rows and columns for Matrix 2
		System.out.println("Enter no of rows for Matrix 2");
		int row2= scan.nextInt();
		System.out.println("Enter no of Columns for Matrix 2");
		int column2 = scan.nextInt();
		// check for possiblity of addition, substraction  and multiplication of Matrices
		if(row1!=row2 && column1!=column2){
			System.out.println("Addition and substraction is not possible");
			if(column1!=row2){
				System.out.println("Matrices with entered orders can't be multiplied with each other");
			}
		}
		else
		{
			System.out.println("Enter the elements of Matrix 1");
			int [][]matrix1 = scanMatrix(row1,column1);
			System.out.println("-Matrix 1-");
			printMatrix(matrix1,row1,column1);
			System.out.println("Enter the elements of Matrix 2");
			int [][]matrix2= scanMatrix(row2, column2);
			System.out.println("-Matrix 2-");
			printMatrix(matrix2, row2, column2);
			
			//
			Implimentations i = new Implimentations();
			i.add(matrix1,matrix2,row1,row2);
			i.subtract(matrix1, matrix2, row1, column1);
			i.multiply(matrix1, matrix2, row1, column2, row2);
			
			
			
		}
		
		
}
	/*
	 * printMatrix function to print matrix
	 */
	protected static void printMatrix(int[][]matrix,int row, int column) {
		for (int i = 0; i < row; i++) {
		     
		       for (int j = 0; j < column; j++) {
		          System.out.print(" "+matrix[i][j]+" ");
		          
		    	}
		       System.out.print("\n");
		   }
		
	}
	/*
	 * scanMatrix Function to scan matrix
	 */
	public static int [][] scanMatrix(int row,int column){
		Scanner sc = new Scanner(System.in);
		int [][]matrix = new int[row][column];
		 for (int i = 0; i < row; i++) {
		     
		       for (int j = 0; j < column; j++) {
		          System.out.println("Row [" + i + "]:  Column " + j + " :");
		          matrix[i][j]=sc.nextInt();
		    	}
		   }
		 return matrix;
	}
	

}
