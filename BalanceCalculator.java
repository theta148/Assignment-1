/**
 * @author Mihir Patel
 * This program will use the initial balance, annual interest rate, and the number of
 * years the money will be saved to calculate the final balance.
 */

import java.util.Scanner;
public class BalanceCalculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Please enter the initial balance: $");
        double initialBalance = console.nextDouble();

        System.out.print("Please enter the annual interest rate (2 for 2%): ");
        double annualInterestRate = console.nextDouble();

        System.out.print("Please enter the number of years the client "
                + "wants to save the money in the bank: ");
        int numOfYears = console.nextInt();

        System.out.printf("\n%-22s: %.2f\n", "Initial Balance",initialBalance);
        System.out.printf("%-22s: %7.2f%%\n", "Annual Interest Rate",annualInterestRate);
        System.out.printf("%-22s: %8d\n", "Saving Years",numOfYears);

        System.out.println("-------------------------------");

        double finalBalance =
                initialBalance * Math.pow((1 + (annualInterestRate) / 100), numOfYears);

        System.out.printf(
                "%s %d %-6s: %1.2f", "Balance After",numOfYears, "Years",finalBalance);
    }
}