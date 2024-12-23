package Assignment1;

import java.util.Scanner;

//12) A school has following rules for grading system: this is the percentage to qualify.
//Create a class called learner, with name ,enroll_no, marks of java,sql,angular,html.
//Use the parameterise constructor to initialize the value and print the grade accordingly.
//a. Below 25 - F
//b. 25 to 45 - E
//c. 45 to 50 - D
//d. 50 to 60 - C
//e. 60 to 80 - B
//f. Above 80 - A
//Ask user to enter marks and print the corresponding grade.

public class Prog22_Grade {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Enrollment Number: ");
    String enrollNo = sc.nextLine();

    System.out.print("Enter marks in Java: ");
    int javaMarks = sc.nextInt();

    System.out.print("Enter marks in SQL: ");
    int sqlMarks = sc.nextInt();

    System.out.print("Enter marks in Angular: ");
    int angularMarks = sc.nextInt();

    System.out.print("Enter marks in HTML: ");
    int htmlMarks = sc.nextInt();
    Learner lr = new Learner(name,enrollNo,javaMarks,sqlMarks,angularMarks,htmlMarks);
    System.out.println("grade is :"+lr.Grade());
}
}
class Learner{
	    private String name;
	    private String enrollNo;
	    private int javaMarks;
	    private int sqlMarks;
	    private int angularMarks;
	    private int htmlMarks;
	public Learner( String name,String enrollNo,int javaMarks,int sqlMarks,int angularMarks,int htmlMarks) {
		this.name = name;
		this.enrollNo = enrollNo;
		this.javaMarks = javaMarks;
		this.sqlMarks = sqlMarks;
        this.angularMarks = angularMarks;
        this.htmlMarks = htmlMarks;
	}
	public double calculatePercentage() {
        int totalMarks = javaMarks+sqlMarks+angularMarks+htmlMarks;
        return (totalMarks/4.0);
    }
	public char Grade() {
		double per = calculatePercentage();
			    if (per < 25) {
		            return 'F';
		        } else if (per < 45) {
		            return 'E';
		        } else if (per < 50) {
		            return 'D';
		        } else if (per < 60) {
		            return 'C';
		        } else if (per < 80) {
		            return 'B';
		        } else {
		            return 'A';
		        }
		}
	}

