package Assignment1;

import java.util.Scanner;
//6) Java Program to Display Fibonacci Series
public class Prog06_Fibonacci {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number :");
	int n = sc.nextInt();
	if(n==0) {
		return;
	}
	int a=0,b=1;
	if(n==1) {
		System.out.println(a);
	}
	else if(n==2) {
		System.out.print(a+" "+b);
	}
	else {
		System.out.print(a+" "+b+" ");
		for(int i=3;i<=n;i++) {
			int next = a+b;
			System.out.print(next+" ");
			a=b;
			b=next;
		}
	}
}
}
