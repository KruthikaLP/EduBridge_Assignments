package Assignment1;

import java.util.Scanner;

public class Prog02_LeapYear{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the Year :");
	int n = sc.nextInt();
	if(n%400==0||(n%4==0 && n%100!=0)) {
		System.out.println("Leap Year");
	}
	else {
		System.out.println("Not Leap Year");
	}
}
}
