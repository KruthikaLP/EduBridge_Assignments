package Assignment2;

import java.util.Arrays;
import java.util.Scanner;
//7.	Write a Java program to test two arrays' equality.
public class Prog21_twoArraysequality {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a size of Array 1:");
	int n1 = sc.nextInt();
	System.out.println("enter a size of Array 2:");
	int n2 = sc.nextInt();
	if(n1!=n2) {
		System.out.println("elements are not equal ");
		return;
	}
	int a1[] = new int[n1];
	int a2[] = new int[n2];
	System.out.println("enter a elements of Array 1:");
	for(int i=0;i<n1;i++) {
		a1[i] = sc.nextInt();
	}
	System.out.println("enter a elements of Array 2:");
	for(int i=0;i<n2;i++) {
		a2[i] = sc.nextInt();
	}
	int c =0;
	for(int i=0;i<n1;i++) {
		if(a1[i]==a2[i]) {
			c++;
		}
	}
	if(c==n1) {
		System.out.println("Array 1 and Array 2 are equal");
	}
	else {
		System.out.println("Array 1 and Array 2 are not equal");
	}
//	if(Arrays.equals(a1, a2)) {
//		System.out.println("Array 1 and Array 2 are equal");
//	}
//	else {
//		System.out.println("Array 1 and Array 2 are not equal");
//	}
}
}
