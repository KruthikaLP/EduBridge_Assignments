package Assignment1;

import java.util.Scanner;

//1) Java Program to Find all Roots of a Quadratic Equation
//•	Use Java Math sqrt()
//The standard form of a quadratic equation is: ax2 + bx + c = 0
//•	Here, a, b, and c are real numbers and a can't be equal to 0.
//•	We can calculate the root of a quadratic by using the formula:
//•	x = (-b ± √(b2-4ac)) / (2a)
//•	The ± sign indicates that there will be two roots:
//•	root1 = (-b + √(b2-4ac)) / (2a)
//•	root1 = (-b - √(b2-4ac)) / (2a

public class Prog01_Quadratic {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 double a = sc.nextInt();
	 double b = sc.nextInt();
	 double c = sc.nextInt();
	 double r1=0, r2=0;
	 if (a != 0) {
         double d = (b*b)-(4*a*c);

         if (d > 0) {
             // Two real roots
             r1 = (-b+Math.sqrt(d))/(2*a);
             r2 = (-b-Math.sqrt(d))/(2*a);
             System.out.println("Roots are real and distinct:");
             System.out.println("Root 1: " + r1);
             System.out.println("Root 2: " + r2);
         } else if (d == 0) {
             // One real root
             r1 = -b/(2*a);
             System.out.println("Roots are real and equal:");
             System.out.println("Root: " + r1);
         } else {
             // Complex roots(both real and imaginary)
             double realPart = -b/(2*a);
             double imaginaryPart = Math.sqrt(-d)/(2*a);
             System.out.println("Roots are complex and distinct:");
             System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
             System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
         }
     } else {
         System.out.println("Make sure 'a' is not zero.");
     }
}
}
