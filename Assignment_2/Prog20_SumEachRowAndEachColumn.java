package Assignment2;

import java.util.Scanner;

//6.	Java Program to find the sum of each row and each column of a matrix
public class Prog20_SumEachRowAndEachColumn {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter row1 for Matrix1 :");
	int row1 = sc.nextInt();
	System.out.println("enter col1 for Matrix1 :");
	int col1 = sc.nextInt();
	int Matrix1[][] = new int[row1][col1];
	System.out.println("enter the elements for Matrix1");
	for(int i=0;i<row1;i++) {
		for(int j=0;j<col1;j++) {
			Matrix1[i][j] = sc.nextInt();
		}
	}
	for(int i=0;i<row1;i++) {
		int rowSum =0;
		for(int j=0;j<col1;j++) {
			rowSum+=Matrix1[i][j];
		}
        System.out.println("Row " + (i + 1) + ": " + rowSum);
	}
	for(int i=0;i<col1;i++) {
		int colSum =0;
		for(int j=0;j<row1;j++) {
			colSum+=Matrix1[j][i];
		}
        System.out.println("col " + (i + 1) + ": " + colSum);
	}
}
}
