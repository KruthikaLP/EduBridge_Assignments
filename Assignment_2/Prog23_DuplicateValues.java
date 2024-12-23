package Assignment2;

import java.util.Scanner;
//9.	 Write a Java program to 
//find duplicate values in an array of string values.
public class Prog23_DuplicateValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of strings:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        System.out.println("Enter the strings:");
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLine();
        }

        boolean foundDuplicate = false;
        
        boolean[] visit = new boolean[n];
        System.out.println("Duplicate values:");
        for (int i = 0; i < n; i++) {
            if (visit[i]) {
                continue; // Skip this element as it's already processed
            }

            // Check if this value occurs again in the array
            for (int j = i + 1; j < n; j++) {
                if (a[i].equals(a[j])) {
                    System.out.println(a[i]);
                    visit[j] = true;
                    foundDuplicate = true;
                    break;
                }
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicate values found.");
        }
    }
}
