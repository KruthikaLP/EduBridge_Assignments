package Assignment1;
import java.util.Scanner;

public class Tempar {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter the far temparatire:");
	Double far = sc.nextDouble();
	System.out.print("celsius :");
	Double celsius = (far-32)*5/9;
	System.out.println(celsius);
}
}
