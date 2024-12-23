package Assignment2;

import java.util.Scanner;

//4.	Write a program to find square of a number.
//E.g.-
//INPUT : 2        OUTPUT : 4
//INPUT : 5        OUTPUT : 25

public class Prog03_square {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number :");
	int n = sc.nextInt();
	System.out.println("squareRoot : "+n*n);
}
}
