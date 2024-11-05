/**
 * @author Mihir Patel
 * This program will convert a 4-digit octal number to a decimal number.
 */

import java.util.Scanner;
public class NumberConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Please enter a 4-digits Octal number: ");
        String octalNum = console.nextLine();

        double intOfFirstDigit = ((int)octalNum.charAt(0)-(int)'0')* Math.pow(8,3);
        double intOfSecondDigit = ((int)octalNum.charAt(1)-(int)'0')* Math.pow(8,2);
        double intOfThirdDigit = ((int)octalNum.charAt(2)-(int)'0')* Math.pow(8,1);
        double intOfFourthDigit = ((int)octalNum.charAt(3)-(int)'0')* Math.pow(8,0);

        double decimalNum =
                intOfFirstDigit + intOfSecondDigit + intOfThirdDigit + intOfFourthDigit;

        System.out.printf("\n%-15s: %s\n", "Octal Number",octalNum);
        System.out.printf("%-15s: %.0f", "Decimal Number",decimalNum);
    }
}