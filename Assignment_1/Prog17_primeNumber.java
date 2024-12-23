package Assignment1;

import java.util.Scanner;

//)Write a program that prompts the user to input a positive integer. It should then output a message indicating whether 
//the number is a prime number.
public class Prog17_primeNumber {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	boolean flag =true;
	if(n<=1) {
		flag = false;
	}
	else {
	for(int i=2;i*i<=n;i++) {
		if(n%i==0) {
			flag =false;
		}
	}
	}
	if(!flag) {
		System.out.println(n+" "+"is not a prime number");
	}
	else {
		System.out.println(n+" "+"is a prime number");
	}
}
}
