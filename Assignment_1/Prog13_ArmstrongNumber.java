//• Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of 
//each digit of the number is equal to the number 
//itself, then the number is called an Armstrong number. 
//For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
package Assignment1;

import java.util.Scanner;

public class Prog13_ArmstrongNumber {
	public static int count(int n) {
		int c =0;
		while(n>0) {
			int t = n%10;
			c++;
			n =n/10;
		}
		return c;
	}
	public static boolean getSum(int n,int c) {
		int sum=0;
		int temp =n;
		while(n>0) {
			int f = n%10;
			sum = sum+(int)Math.pow(f, c);
			n=n/10;
		}
		return sum==temp;
	}
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    for(int i=a;i<=b;i++) {
    	int ct = count(i);
    	boolean isArm = getSum(i,ct);
    	if(isArm==true) {
    		System.out.println(i);
    	}
    }
}
}
