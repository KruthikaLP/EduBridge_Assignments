package Assignment2;

import java.util.Scanner;

//11.	Define a method to calculate power of a number raised to other 
//i.e. ab using recursion where the numbers 'a' and 'b' are to be entered by the user

public class Prog09_RecursionPower {
	public static int power(int a, int b) {
        if (b == 0) { // Base case: a^0 = 1
            return 1;
        }
        return a * power(a, b - 1);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the base (a):");
	int base = sc.nextInt();
	System.out.println("Enter the exponent (b):");
	int exponent = sc.nextInt();
	System.out.println("power of a number  : "+power(base,exponent));
	
}
}
