package Assignment2;

import java.util.Scanner;

//10.	Write a program that takes as input your gross salary and your total saving and uses another function named taxCalculator() to calculate your tax. 
//The taxCalculator() function takes as parameters the gross salary as well as the total savings amount. The tax is calculated as follows:
//(a) The savings is deducted from the gross income to calculate the taxable income. Maximum deduction of savings can be Rs. 100,000, 
//even though the amount can be more than this.
//(b) For up to 100,000 as taxable income the tax is 0 (Slab 0); beyond 100,000 to 200,000 tax is 10% of the difference above 100,000 (Slab 1);
//beyond 200,000 up to 500,000 the net tax is the tax calculated from Slab 0 and Slab 1 and then 20% of the taxable income exceeding 200,000 (Slab 2);
//if its more than 500,000, then the tax is tax from Slab 0, Slab 1, Slab 2 and 30% of the amount exceeding 500,000.

public class Prog08_taxable_income {
	public static double taxCalculator(double grossSalary, double totalSavings) {
        // Apply savings deduction limit
        double deductibleSavings = Math.min(totalSavings, 100000);

        // Calculate taxable income
        double taxableIncome = grossSalary - deductibleSavings;

        // Initialize tax
        double tax = 0;

        // Calculate tax based on slabs
        if (taxableIncome <= 100000) {
            tax = 0; // Slab 0
        } else if (taxableIncome <= 200000) {
            tax = 0.1 * (taxableIncome - 100000); // Slab 1
        } else if (taxableIncome <= 500000) {
            tax = (0.1 * 100000) + (0.2 * (taxableIncome - 200000)); // Slab 2
        } else {
            tax = (0.1 * 100000) + (0.2 * 300000) + (0.3 * (taxableIncome - 500000)); // Slab 3
        }

        return tax;
	}
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);

     // Input gross salary
     System.out.print("Enter your gross salary: ");
     double grossSalary = sc.nextDouble();

     // Input total savings
     System.out.print("Enter your total savings: ");
     double totalSavings = sc.nextDouble();

     // Call taxCalculator function and display the tax
     double tax = taxCalculator(grossSalary, totalSavings);
     System.out.println("Your calculated tax is: Rs. " + tax);
 }
}

