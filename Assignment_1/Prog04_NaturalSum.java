package Assignment1;
import java.util.Scanner;
//4) Java Program to Calculate the Sum of Natural Numbers
public class Prog04_NaturalSum {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter the number :");
	int n = sc.nextInt();
	int sum =0;
	for(int i=1;i<=n;i++) {
		sum=sum+i;
	}
	System.out.println("sum :"+sum);
}
}
