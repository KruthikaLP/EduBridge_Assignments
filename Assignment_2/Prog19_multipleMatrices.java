package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

//5.	Multiply Two Matrices 3x3 matrices
public class Prog19_multipleMatrices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a row1 :");
		int row1 = sc.nextInt();
		System.out.println("enter a col1 :");
		int col1 = sc.nextInt();
		int matrix1[][] = new int[row1][col1];
		System.out.println("enter elements for Matrix 1 :");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		System.out.println("enter a row2 :");
		int row2 = sc.nextInt();
		System.out.println("enter a col2 :");
		int col2 = sc.nextInt();
		if (row1 != row2 || col1 != col2) {
	        System.out.println("Matrix addition is not possible. Dimensions do not match.");
	        return;
	    }
		System.out.println("enter elements for Matrix 2 :");
		int matrix2[][] = new int[row2][col2];
		for(int i=0;i<row2;i++) {
			for(int j=0;j<col2;j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}
		int resmatrix[][] = new int[row1][col1];
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				resmatrix[i][j] =matrix1[i][j]*matrix2[i][j];
			}
		}
//		System.out.println("Resultant Matrix:");
//	    for (int i = 0; i < row1; i++) {
//	        for (int j = 0; j < col1; j++) {
//	            System.out.print(resultMatrix[i][j] + " ");
//	        }
//	        System.out.println();
//	    }
		System.out.println();
		System.out.println("\\Display :-");
		for(int[] res :resmatrix) {
			System.out.println(Arrays.toString(res));
		}
	}

}
