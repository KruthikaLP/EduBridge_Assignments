package Assignment1;

import java.util.Random;
import java.util.Scanner;

public class Prog18_GuessNumber {
public static void main(String[] args) {
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	int randomNumber = ran.nextInt(100)+1;
	int attempts =0,userGuess=0;
	do {
//		if(attempts==3) {
//			System.out.println("attempts over");
//			return;
//		}
		System.out.println("enter a guess number");
		userGuess = sc.nextInt();
		attempts++;

		if (userGuess < randomNumber) {
            System.out.println("Too low! Try again.");
        } else if (userGuess > randomNumber) {
            System.out.println("Too high! Try again.");
        } else {
            System.out.println("Congratulations! You've guessed the number.");
            System.out.println("you took  "+ attempts + " attempts.");
        }
    } while (userGuess != randomNumber);

}
}
