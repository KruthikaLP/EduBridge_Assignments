//Two numbers are entered through the keyboard. 
//Write a program to find the value of one number raised to the power of another. 
//(Do not use Java built-in method)

package Assignment1;

import java.util.Scanner;

public class Prog23_Power {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long pow = sc.nextInt(),exp=sc.nextInt();
	long res =1;
	for(int i=0;i<exp;i++) {
		res = res*pow;
	}
	System.out.println(res);
}
}
