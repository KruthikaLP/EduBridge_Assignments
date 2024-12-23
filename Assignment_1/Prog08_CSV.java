package Assignment1;

import java.util.Scanner;

//8) Write a Java program to test if an array 
//contains a specific value.
public class Prog08_CSV {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size :");
	int n = sc.nextInt();
	int a[] = new int[n];
	System.out.println("enter target :");
	int target = sc.nextInt();
	System.out.println("enter elements :");
	for(int i=0;i<a.length;i++) {
		a[i] = sc.nextInt();
	}
	boolean contain = false;
   for(int i=0;i<a.length;i++) {
	   if(a[i]==target) {
		   contain = true;
		   break;
	   }
   }
   System.out.println(" Is Array contains a specific value :"+contain);
}
}
