package Assignment2;

import java.util.Scanner;

//2.	Write a Java program to concatenate a given string to the end of another string.
//Sample Output:
//i.	String 1: PHP Exercises and                                                                                   
//ii.	String 2: Python Exercises                                                                                    
//iii.	The concatenated string: PHP Exercises and Python Exercises

public class Prog26_concatenation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 1st String");
		String s1 = sc.nextLine();
		System.out.println("Enter a 1st String");
		String s2 = sc.nextLine();
		System.out.println("The concatenated string: "+s1.concat(" "+s2));
	}

}
