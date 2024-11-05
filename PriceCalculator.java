/**
 * @author Mihir Patel
 * This program will use the original price, a discount, a provincial and federal tax
 * to calculate the final price.
 */

import java.util.Scanner;
public class PriceCalculator {
    public static void main (String[] args) {
        double price;
        double discountRatio;
        double discountPrice;
        double federalTax;
        double provincialTax;
        double finalPrice;

        Scanner console = new Scanner(System.in);

        System.out.print("Please enter the item price: ");
        price = console.nextDouble();

        System.out.print("Please enter discount ratio (5 for 5%): ");
        discountRatio = console.nextInt();

        discountPrice = price * (100 - discountRatio) / 100;

        System.out.printf("\n%-17s: %.2f \n", "Original Price", price);
        System.out.printf("%-17s: %.2f%% \n", "Discount Ratio", discountRatio);
        System.out.printf("%-17s: %.2f \n", "Price Before Tax",discountPrice);

        System.out.println("-------------------------------");

        federalTax = discountPrice * 0.05;
        provincialTax = discountPrice * 0.09975;
        finalPrice = discountPrice + federalTax + provincialTax;

        System.out.printf("%-17s: %.2f \n", "Federal Tax",federalTax);
        System.out.printf("%-17s: %.2f \n", "Provincial Tax",provincialTax);
        System.out.printf("%-17s: %.2f", "Final Price",finalPrice);
    }
}