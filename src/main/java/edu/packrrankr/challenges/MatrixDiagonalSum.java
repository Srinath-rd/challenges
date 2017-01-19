package edu.packrrankr.challenges;

import java.util.Scanner;

public class MatrixDiagonalSum {

	public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int size = scanner.nextInt();
         int[][] matrix = new int[size][size];
         int sum1 = 0;
         int sum2 = 0;
         for(int i=0;i<size;i++){
        	 for(int j=0; j<size; j++){
        		 String s = scanner.next();
        		 matrix[i][j] = Integer.parseInt(s);
        		 if(i == j)
        			 sum1 += matrix[i][j]; 
        	 }
         }
         int j = 0;
         for(int i=size-1; i>=0; i--){
        	
        		 sum2 += matrix[i][j];
        		 j++;
         }
        
         int sum = sum1 - sum2;
         if(sum < 0) sum = -(sum);
         System.out.println(sum);
         scanner.close();
	}

}
