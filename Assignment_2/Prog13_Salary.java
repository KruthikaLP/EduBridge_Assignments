package Assignment2;

import java.util.Scanner;

//15. Write a program by creating an 'Employee' class having the following methods and print the final salary.
//1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
//2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
//3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.

class Employee{
	int salary =0;
	int work =0;
	public void getInfo(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a salary :");
		salary = sc.nextInt();
		System.out.println("Enter number of hours of work per day :");
		 work = sc.nextInt();
	}
	public void addSal() {
		if(salary<500) {
			salary +=10;
		}
	}
	public void addWork() {
		if(work>6) {
			salary +=5;
		}
	}
	public void displaySalary() {
        System.out.println("Final Salary: $" + salary);
    }
}
public class Prog13_Salary {
public static void main(String[] args) {
	Employee e = new Employee();
	e.getInfo();
	e.addSal();
	e.addWork();
	e.displaySalary();
}
}
