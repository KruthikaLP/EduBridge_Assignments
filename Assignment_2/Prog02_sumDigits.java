package Assignment2;

import java.util.Scanner;

//3.	Write a program to calculate the sum of the digits of a 3-digit number.
//Number : 132        Output : 6

public class Prog02_sumDigits {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int sum=0;
	while(n>0) {
		int t = n%10;
		sum = sum+t;
		n=n/10;
	}
	System.out.println(sum);
}
}
