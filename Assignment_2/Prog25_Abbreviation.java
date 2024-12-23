package Assignment2;

import java.util.Scanner;

//1.	Write a program that takes your full name as input and displays 
//the abbreviations of the first and middle names except the last name which is displayed as it is. For example, 
//if your name is Robert Brett Roser, then the output should be R.B.Roser.

public class Prog25_Abbreviation {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	
	String[] nameParts = name.split(" ");
	
	if (nameParts.length < 2) {
        System.out.println("Please enter at least a first and last name.");
        return;
    }
	
	StringBuilder sb = new StringBuilder();
	
	for(int i=0;i<nameParts.length-1;i++) {
		sb.append(nameParts[i].charAt(0)).append(".");
	}
	sb.append(nameParts[nameParts.length-1]);
	System.out.println("Abbreviated Name: " + sb);
}
}
