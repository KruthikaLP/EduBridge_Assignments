package Assignment1;

import java.util.Scanner;

public class Prog14_Patterns{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	int n = sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println();
	for(int i=1;i<=n;i++) {
		for(int j=i;j<=n;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println();
	for(int i=1;i<=n;i++) {
		for(int j=i;j<=n;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println();
	
	for(int i=1;i<=n;i++) {
		for(int j=i;j<=n;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print("*");
		}
		for(int t=2;t<=i;t++) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println();
	
	for(int i=1;i<=n;i++) {
		for(int j=i;j<=n;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print(i);
		}
		for(int t=2;t<=i;t++) {
			System.out.print(i);
		}
		System.out.println();
	}
	
}
}
