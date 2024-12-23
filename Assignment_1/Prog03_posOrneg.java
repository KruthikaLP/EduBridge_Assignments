package Assignment1;
import java.util.Scanner;
//3) Java Program to Check Whether a Number is 3) Java Program to Check Whether a Number is Positive or Negative or Negative
public class Prog03_posOrneg {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int n = sc.nextInt();
	System.out.println(n>0?"positive":"negative");
}
}
