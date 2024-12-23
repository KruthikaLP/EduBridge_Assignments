package Assignment1;

import java.util.Scanner;

//10) Write a Java program to find duplicate values
//in an array of integer values.
public class Prog10_Duplicate {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter size :");
	int n = sc.nextInt();
	int a[] = new int[n];
	System.out.println("enter elements :");
	for(int i=0;i<n;i++) {
		a[i] = sc.nextInt();
	}
	System.out.println("Duplicate Numbers are :");
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				System.out.print(a[j]+" ");
			}
		}
	}
}
}
