package Assignment2;

import java.util.Scanner;

//2.	Java Program to print the largest element in an array
public class Prog16_Largest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a[] = new int[n];
	for(int i=0;i<a.length;i++) {
		a[i] = sc.nextInt();
	}
	int max = a[0];
	for(int i=1;i<a.length;i++) {
		if(max<a[i]) {
			max=a[i];
		}
	}
	System.out.println("Largest element :"+max);
}
}
