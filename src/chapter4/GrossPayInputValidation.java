package chapter4;
/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String args[]){

        // Initialize known variables
        int rate = 15;
        int maxHours = 40;

        // Get input for unknown variables
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        // Verify input
        while (hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Invalid number of hours. Your hours must be between 1 and 40. Please try again.");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        // Output
        double pay = rate * hoursWorked;
        System.out.println("Your pay for the week is: " + pay);

    }

}
