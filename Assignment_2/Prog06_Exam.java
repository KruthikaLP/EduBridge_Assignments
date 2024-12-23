package Assignment2;

import java.util.Scanner;

//8.	A student will not be allowed to sit in exam if his/her attendance is less than 75%.
//Take following input from user
//Number of classes held
//Number of classes attended.
//And print
//percentage of class attended
//Is student is allowed to sit in exam or not.

public class Prog06_Exam {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("How many Number of classes held:");
	int cls = sc.nextInt();
	System.out.println("Number of classes attended :");
	float attend = sc.nextFloat();
	double attendancePercentage = ((double) attend/cls) * 100;
	System.out.println("percentage :"+attendancePercentage +"%");
	if(attendancePercentage<75) {
		System.out.println("Not allowed for examination");
	}
	else {
		System.out.println("Allowed for examination");
	}
}
}
