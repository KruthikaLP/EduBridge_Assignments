package Assignment2;
//2.	The total number of students in a class are 90 out of which 45 are boys. 
//If 50% of the total students secured grade 'A' out of which 20 are boys, 
//then write a program to calculate the total number of girls getting grade 'A'.
public class Prog01_girls_getting_grade_A {
public static void main(String[] args) {
	 int totalStudents = 90;
     int boys = 45;
     //50% of the total students secured grade 'A' out of which 20 are boys, 
     int totalGradeA = totalStudents / 2; 
     int boysGradeA = 20;
     
     int girlsGradeA = totalGradeA - boysGradeA;
     System.out.println("Total number of girls getting grade 'A': " + girlsGradeA);

}
}
