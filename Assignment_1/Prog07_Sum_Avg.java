package Assignment1;

import java.util.Scanner;
//7) Compute Sum and Average of Array Elements.
public class Prog07_Sum_Avg{
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 int a[] = new int[n];
 for(int i=0;i<n;i++) {
	 a[i] = sc.nextInt();
 }
 int sum =0;
 for(int i=0;i<a.length;i++) {
	sum = sum+a[i]; 
 }
 int avg = sum/n;
 System.out.println("Sum :"+sum);
 System.out.println("Avg :"+avg);
}
}
