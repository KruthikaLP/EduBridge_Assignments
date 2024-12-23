package Assignment2;

import java.util.Scanner;

//13.	Take an array of 10 elements. Split it into middle and 
//store the elements in two dfferent arrays. E.g.-
//INITIAL array :
//58	24	13	15	63	9	8	81	1	78
//After spliting :
//58	24	13	15	63
//9	8	81	1	78

public class Prog11_SplitMiddleArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a size :");
	int n = sc.nextInt();
	int a[] = new int[n];
	int mid = n/2;
	System.out.println("enter a elements");
	for(int i=0;i<n;i++) {
		a[i] = sc.nextInt();
	}
	System.out.println("1st Array elements :");
	for(int i=0;i<mid;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("2st Array elements :");
	for(int i=mid;i<n;i++) {
		System.out.print(a[i]+" ");
	}
}
}
