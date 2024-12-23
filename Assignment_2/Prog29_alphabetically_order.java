package Assignment2;

import java.util.Scanner;

//5.	Write down the names of 10 of your friends in an array and 
//then sort those in alphabetically ascending order.
public class Prog29_alphabetically_order {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number of students :");
	int n = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter a names of students :");
	String name[] = new String[n];
	for(int i=0;i<name.length;i++) {
		name[i] = sc.nextLine();
	}
	for(int i=0;i<n-1;i++) {
		for(int j=0;j<n-i-1;j++) {
		if(name[j].compareTo(name[j+1])>0) {
			String temp = name[j];
            name[j] = name[j+1];
            name[j+1] = temp;
		}
	}
	}
	System.out.println("Friends' names in alphabetical order:");
    for (String names : name) {
        System.out.println("names are :"+names);
    }
}
}
