package Assignment2;

import java.util.Scanner;

//1.	Java Program to sort the elements of an array in descending order
public class Prog15_Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int og : a) {
			System.out.print(og+" ");
		}
		//bobble sort
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) { //i reduce unneccary comparision{
				if(a[j]<a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] =temp;
				}
			}
		}
		System.out.println();
		for(int og : a) {
			System.out.print(og+" ");
		}
	}
}
