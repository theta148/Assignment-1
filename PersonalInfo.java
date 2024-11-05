/**
 * @author: Mihir Patel
 *This program will organize the personal information, and also round pi to 2 decimal
 * places.
 */

import java.util.Scanner;
public class PersonalInfo {
    public static void main(String[] args) {
        String name;
        int age;
        String gender;
        String course;
        double PI;

        Scanner console = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        name = console.nextLine();

        System.out.print("Please enter your age: ");
        age = console.nextInt();
        console.nextLine();

        System.out.print("Please enter your gender: ");
        gender = console.nextLine();

        System.out.print("Please enter your department: ");
        course = console.nextLine();

        System.out.print("Please enter the value of PI (3.1415926): ");
        PI = console.nextDouble();
        console.nextLine();

        System.out.printf("%-14s: %s \n", "Name",name);
        System.out.printf("%-14s: %d \n", "Age",age);
        System.out.printf("%-14s: %s \n", "Gender",gender);
        System.out.printf("%-14s: %s\n", "Department",course);
        System.out.printf("%-14s: %.2f", "PI",PI);
    }
}