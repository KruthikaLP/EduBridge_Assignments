package Assignment1;

import java.util.Scanner;

public class Prog16_SumPosNeg {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter size :");
	int n = sc.nextInt();
	int a[] = new int[n];
	System.out.println("enter elem :");
	for(int i=0;i<a.length;i++) {
		a[i] = sc.nextInt();
	}
	int evenSum=0,oddSum =0;
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			evenSum+=a[i];
		}
		else {
			oddSum+=a[i];
		}
	}
	System.out.println("evenSum :"+evenSum+"\n"+"oddSum :"+oddSum);
	
}
}
