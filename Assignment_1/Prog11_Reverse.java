package Assignment1;

import java.util.Scanner;

//11) Write a Java program to reverse an array of integer values.
public class Prog11_Reverse {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter size :");
	int n = sc.nextInt();
	int a[] = new int[n];
	System.out.println("enter elem :");
	for(int i=0;i<n;i++) {
		a[i] = sc.nextInt();
	}
	System.out.println("Original :");
	for(int i=0;i<n;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("Reverse :");
	for(int i=n-1;i>=0;i--) {
		System.out.print(a[i]+" ");
	}
}
}
