package Assignment2;

import java.util.HashMap;
import java.util.Scanner;

//3.	Java Program to find the frequency of each element in the array
public class Prog17_frequency {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number :");
	int n = sc.nextInt();
	int a[] = new int[n];
	System.out.println("enter elements :");
	for(int i=0;i<n;i++) {
		a[i] = sc.nextInt();
	}
//	HashMap<Integer,Integer> map = new HashMap<>();
//	for(int m : a) {
//		map.put(m, map.getOrDefault(m, 0)+1);
//	}
//	System.out.println(map);
	boolean[] visit = new boolean[n];
	System.out.println("element"+" | "+"frequency");
	for(int i=0;i<n;i++) {
		if(visit[i]==true) {
			continue;
		}
		int count=1;
		for(int j=i+1;j<n;j++) {
			if(a[i]==a[j]) {
				count++;
			visit[j] = true;
			}
		}
		System.out.println("     "+a[i]+"  | "+count);
	}
}
}
