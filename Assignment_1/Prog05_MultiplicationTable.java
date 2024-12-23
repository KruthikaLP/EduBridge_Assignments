package Assignment1;
import java.util.Scanner;
//5) Java Program to Generate Multiplication Table. Take Number as an input from User.
public class Prog05_MultiplicationTable{
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
//	System.out.println("enter the elem :");
//	int e = sc.nextInt();
	for(int j=1;j<=20;j++) {
		for(int i=1;i<=10;i++) {
			System.out.println(j +"*"+i+"="+j*i);
		}
		System.out.println();
	}
}
}
