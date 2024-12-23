package Assignment2;

import java.util.Scanner;

//5.	If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
//write a program to calculate his total marks and percentage marks.
public class Prog04_per {
public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter the three Subjects marks/100 :");
	int m1 = sc.nextInt();
	int m2 = sc.nextInt();
	int m3 = sc.nextInt();
	int total = m1+m2+m3;
	double avg = (m1+m2+m3)/3.0;
	System.out.println("TotalMarks :"+total+"/300"+"\n"+"percentage :"+avg+"%");
}
}
