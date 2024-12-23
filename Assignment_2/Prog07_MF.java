package Assignment2;

import java.util.Scanner;

//9.	Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
//if employee is female, then she will work only in urban areas.
//
//if employee is a male and age is in between 20 to 40 then he may work in anywhere
//
//if employee is male and age is in between 40 t0 60 then he will work in urban areas only.

public class Prog07_MF {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a age :");
	int age = sc.nextInt();
	
	if(age>60) {
		System.out.println("ERROR");
		return;
	}
	
	System.out.println("enter a Sex M or F:");
	char c = sc.next().charAt(0);
	if(c=='F'||c=='f') {
		System.out.println("she can work only in urban areas");
	}
	else if((c=='m'||c=='M') && (age>=20 && age <=40)) {
		System.out.println("he may work in anywhere");
	}
	else if((c=='m'||c=='M')&& (age>=40 && age <=60)){
		System.out.println("he can work in urban areas only.");
	}
}
}
