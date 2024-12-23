package Assignment2;

import java.util.Scanner;

//12.	Take an array of length n where all the numbers are nonnegative and unique. Find the element in the array possessing the highest value. 
//Split the element into two parts where first part contains the next highest value in the array and second part hold the required additive entity to get the highest value.
//Print the array where the highest value get splitted into those two parts.
//Sample input: 4 8 6 3 2
//Sample output: 4 6 2 6 3 2

public class Prog10_Highestandadditive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size :");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements :");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		int nextMax =0;
		int MaxIdx = -1;
		for(int i=0;i<n;i++) {
			if(a[i]>max) {
				nextMax = max;
				max =a[i];
				MaxIdx = i;
			}
			else if(a[i]>nextMax && max !=a[i]) {
				nextMax = a[i];
			}
		}
		int additive = max-nextMax;

		for(int i=0;i<n;i++) {
			if(MaxIdx ==i) {
				System.out.print(nextMax+" "+additive+" ");
			}
			else {
				System.out.print(a[i] + " ");
			}
		}


	}
}
