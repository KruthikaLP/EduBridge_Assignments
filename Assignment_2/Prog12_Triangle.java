package Assignment2;

import java.util.Scanner;

//14. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a 
//class named 'Triangle' without any parameter in its constructor.
class Triangle{
	Scanner sc = new Scanner(System.in);
	int base;
	int height;
	Triangle(){
		super();
	}
	public void area() {
		System.out.println("Area of Triangle ");
		System.out.println("enter a base :");
		base = sc.nextInt();
		System.out.println("enter a height :");
		height = sc.nextInt();
		double area = 0.5*base*height;
		System.out.println("Area of Triangle :"+area);
		System.out.println();
	}
	public void perimeter() {
		System.out.println("perimeter of Triangle ");
		System.out.println("enter a A side :");
		int A = sc.nextInt();
		System.out.println("enter a B side :");
		int B = sc.nextInt();
		System.out.println("enter a C side :");
		int C = sc.nextInt();
		int peri = A+B+C;
		System.out.println("Perimeter of the Triangle :"+peri);
	}
}

public class Prog12_Triangle {
public static void main(String[] args) {
	Triangle tr = new Triangle();
	tr.area();
	tr.perimeter();
}
}
