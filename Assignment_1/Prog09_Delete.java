package Assignment1;

import java.util.Scanner;

//9) Write a Java program to remove a specific element from an array. 
//Index number you can make it fix.
public class Prog09_Delete {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter size :");
	int n = sc.nextInt();
	System.out.println("enter target :");
	int target = sc.nextInt();
	int a[] = new int[n];
	System.out.println("enter ele :");
	for(int i=0;i<n;i++) {
		a[i] = sc.nextInt();
	}
	System.out.println("Before Deletion :");
	for(int i=0;i<n;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("After Deletion :");
	for(int i=0;i<n;i++) {
		if(a[i]==target) {
			continue;
		}
		System.out.print(a[i]+" ");
	}
}
}
