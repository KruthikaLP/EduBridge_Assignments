package Assignment1;

import java.util.Scanner;

//1)Write a program to enter the numbers till the user wants and at the end it 
//should display the count of positive, negative and zeros entered. 
public class Prog12_doCount {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int pc=0,nc=0,zc=0;
	do {
		System.out.println("enter true or false ");
		boolean user = sc.nextBoolean();
		if(user==true) {
		System.out.println("enter number");
		int n = sc.nextInt();
		if(n>0) {
			pc++;
		}
		else if(n==0) {
			zc++;
		}
		else {
			nc++;
		}
		}
		else {
			System.out.println("program terminated");
			return;
		}
		System.out.println("positive count :"+pc+"\n"+"negative count :"+nc+"\n"+"ZeroCount :"+zc);
	}while(true);
}
}
