package Assignment2;

import java.util.Scanner;
//4.	Write a program to find out the largest and 
//smallest word in the string "This is an umbrella".
public class Prog28_smallestLargestString_ {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string :");
	String s = sc.nextLine();
	String[] words = s.split(" ");
	String small = words[0];
	String large = words[0];
	for(String word : words) {
		if(word.length()<small.length()) {
			small = word;
		}
	    else if (word.length() == small.length()) {
         // Handle ties by selecting the first occurrence
         small = small.compareTo(word) <= 0 ? small : word;
     }
		if(word.length()>large.length()) {
			large = word;
		}
		 else if (word.length() == large.length()) {
	         // Handle ties by selecting the first occurrence
	         large = large.compareTo(word) >= 0 ? large : word;
	     }
	}
	System.out.println("smallest :"+ small);
	System.out.println("largest :"+ large);
}
}
