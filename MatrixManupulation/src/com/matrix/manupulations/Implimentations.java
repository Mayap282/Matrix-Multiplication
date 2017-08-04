package com.matrix.manupulations;

public class Implimentations extends ScanMatrices implements MatrixFunctions{
	
	public void add(int[][]matrix1,int matrix2[][],int row, int column) {
		// TODO Auto-generated method stub
		int [][]matrix = new int[row][column];
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				matrix[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		System.out.println("Addition of Matices");
		printMatrix(matrix, row, column);
		
	}
	@Override
	public void subtract(int[][]matrix1,int matrix2[][],int row, int column) {
		// TODO Auto-generated method stub
		int [][]matrix = new int[row][column];
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				matrix[i][j]=matrix1[i][j]-matrix2[i][j];
			}
		}
		System.out.println("Subtraction of Matices");
		printMatrix(matrix, row, column);
		
	}
	@Override
	public void multiply(int[][] matrix1, int[][] matrix2, int row1, int column2,int row2) {
		// TODO Auto-generated method stub
		int [][]matrix = new int[row1][column2];
		int sum = 0;
		 for (int i = 0 ; i < row1 ; i++ )
         {
            for (int j = 0 ; j < column2 ; j++ )
            {   
               for (int  k = 0 ; k < row2 ; k++ )
               {
                  sum = sum + matrix1[i][k]*matrix2[k][j];
               }
 
               matrix[i][j] = sum;
               sum = 0;
            }
         }
		System.out.println("Multiplication of Matices");
		printMatrix(matrix, row1, column2);
	}
	

}
