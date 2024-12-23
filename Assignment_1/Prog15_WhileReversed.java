package Assignment1;

import java.util.Scanner;

//4)Write a program that prompts the user to input an integer 
//and then outputs the number with the digits reversed. For example, 
//if the input is 12345, the output should be 54321.
public class Prog15_WhileReversed {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number :");
	int n = sc.nextInt();
	System.out.println("Original :"+n);
	int rev =0;
	while(n>0) {
		int t = n%10;
		rev = rev*10+t;
		n=n/10;
	}
	System.out.println("reverse :"+rev);
}
}
