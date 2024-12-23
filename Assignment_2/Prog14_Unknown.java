package Assignment2;

import java.util.Scanner;

//16. Write a program to print the names of students by creating a Student class. If no name is passed while creating an object of Student class, then the name should be "Unknown",
//otherwise the name should be equal to the String value passed while creating object of Student class.
class Students{
	String name;
	public Students() {
		this.name ="unknown";
	}
	public Students(String name) {
		this.name = name;
	}
//	 public void displayName() {
//	        System.out.println("Student Name: " + name);
//	    }
}
public class Prog14_Unknown {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many students to be stored :");
		int n = sc.nextInt();
		sc.nextLine();//imp
		Students a[] = new  Students[n];

		for(int i=0;i<n;i++) {
			System.out.println("Enter the name or or press Enter to keep it 'Unknown':");
			System.out.print("Student "+(i+1)+" "+":");
			String name = sc.nextLine();
			sc.nextLine();//imp
			if(name.isEmpty()) {
				a[i] = new Students();
			}else {
				a[i] = new Students(name);
			}
		}
        System.out.println("//Student Details:-");
		for(Students st : a) {
//			st.displayName();
			System.out.println(st.name);
		}
	}
}
