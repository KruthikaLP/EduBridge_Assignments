package Assignment2;

import java.util.Scanner;

//3.	Write a program to delete all consonant from the string "Hello, have a good day".
public class Prog27_DeleteConsonant {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String :");
	String s = sc.nextLine();
	StringBuilder sb = new StringBuilder();
	for(int i=0;i<s.length();i++) {
		char c = s.charAt(i);
		if ("aeiouAEIOU".indexOf(c) != -1 || !Character.isLetter(c)) {
            sb.append(c);
        }
	}
	System.out.println("String after removing consonants:");
    System.out.println(sb.toString());
}
}
