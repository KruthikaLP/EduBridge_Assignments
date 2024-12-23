package Assignment1;

import java.util.Scanner;
//Print Weird if the number is weird; otherwise, print Not Weird.
//Sample Input 0
//3
//Sample Output 0
//Weird
//Sample Input 1
//24
//Sample Output 1
//Not Weird


public class Prog20_Wierd {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number in b/w 1 to 100");
	int n = sc.nextInt();
	if(n>=1 && n<=100) {
		if(n%2==0) {
			System.out.println("Not Wierd");
		}
		else {
			System.out.println("Wierd");
		}
	}
}
}
