package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

//10.	Write a Java program to 
//find common elements between two integer arrays.
public class Prog24_CommonEleBtwTwoArrays {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	int a[] = new int[n1];
	int b[] = new int[n2];
	for(int i=0;i<n1;i++) {
		a[i] = sc.nextInt();
	}
	for(int i=0;i<n2;i++) {
		b[i] = sc.nextInt();
	}
	Arrays.sort(a);
	Arrays.sort(b);
	
	int i = 0, j = 0;
    System.out.println("Common elements:");
    boolean found = false;
    int prev = Integer.MIN_VALUE; // To track the last printed element
    while (i < n1 && j < n2) {
        if (a[i] == b[j]) {
            if (a[i] != prev) { // Print only if it's not a duplicate
                System.out.print(a[i] + " ");
                prev = a[i];
                found = true;
            }
            i++;
            j++;
        }
        else if (a[i] < b[j]) {
            i++;
        } 
        else {
            j++;
        }
    }
    if(!found) {
    	System.out.println("no common elements");
    }
}
}
