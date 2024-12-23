package Assignment1;

import java.util.Scanner;
//8) Write a Java program to find the number of even and odd integers
//in a given array of integers.
public class Prog19_printEvenOddEle {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter size :");
	int n = sc.nextInt();
	int a[] = new int[n];
	System.out.println("enter ele :");
	for(int i=0;i<n;i++) {
		a[i] = sc.nextInt();
	}
	 int evenCount = 0, oddCount = 0;
     StringBuilder evenNumbers = new StringBuilder();
     StringBuilder oddNumbers = new StringBuilder();
	for(int i=0;i<n;i++) {
		if(a[i]%2==0) {
			evenCount++;
			evenNumbers.append(a[i]).append(" ");
		}
		else {
			oddCount++;
			oddNumbers.append(a[i]).append(" ");
		}
	}
	System.out.println("evencount :"+evenCount+"\n"+"even numbers are :"+evenNumbers 
			+"\n"+"oddCount :"+oddCount+"\n"+"odd numbers are :"+ oddNumbers);
}
}
