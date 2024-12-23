package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

//8.	Write a Java program to remove duplicate elements from a given array and return the updated array length.
//Sample array: [20, 20, 30, 40, 50, 50, 50]
//After removing the duplicate elements the program should return 4 as the new length of the array.

public class Prog22_RemoveDuplicate {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a[] = new int[n];
	for(int i=0;i<n;i++) {
		a[i] = sc.nextInt();
	}
	
	Arrays.sort(a);
	int c=1;
	int j=0;
	int temp[] = new int[n];
	for(int i=0;i<n-1;i++) {
		if(a[i]!=a[i+1]) {
			temp[j] = a[i];
			j++;
			c++;
		}
	}
	//imp //for last ele
	temp[j++] = a[n-1];
	
//	for(int i=0;i<temp.length;i++) {
//		System.out.print(temp[i]+" ");
//	}
	System.out.println(c+" "+Arrays.toString(temp));
}
}
