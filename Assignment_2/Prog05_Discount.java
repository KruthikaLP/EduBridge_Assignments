package Assignment2;

import java.util.Scanner;

//6.	A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//Ask user for quantity
//Suppose, one unit will cost 100.
//Judge and print total cost for user.

public class Prog05_Discount {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the quantity u want :");
	int n = sc.nextInt();
	//one unit will cost 100.//mention in question
	int oneUnit = 100;
	int total = n*oneUnit;
	if(total>1000) {
		double cost = total - (total *0.1);
		System.out.println("congrats!! ur eligible for discount :");
		System.out.println("Total cost after discount: "+cost);
	}
	else {
		System.out.println("cost :"+total);
	}
}
}
