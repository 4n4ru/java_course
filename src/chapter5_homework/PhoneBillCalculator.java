package chapter5_homework;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Calculate the final total of someone's cell phone bill.
 * Allow the operator to input the plan fee and the number of overage minutes.
 * Charge the user 0.25 for every minute they were over their plan, and 15% tax on the subtotal.
 * Create separate methods to calculate the tax, overage fees, and final total.
 * Print the itemized bill.
 */

public class PhoneBillCalculator {

    static Scanner scanner = new Scanner(System.in);
    static double minuteFee = 0.25;
    static int taxPercentage = 15;

    public static void main(String args[]){

        double planFee = getPlanFee();
        int overageMinutes = getOverageMinutes();
        scanner.close();
        double overageFees = calculateOverageFees(overageMinutes);
        double subtotal = planFee + overageFees;
        double tax = calculateTax(subtotal);
        double total = subtotal + tax;
        printBill(planFee, overageFees, tax, total);

    }

    private static void printBill(double planFee, double overageFees, double tax, double total) {
        final DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Phone Bill Statement:");
        System.out.println("Plan: $" + planFee);
        System.out.println("Overage: $" + overageFees);
        System.out.println("Tax: $" + df.format(tax));
        System.out.println("Total: $" + df.format(total));
    }

    private static double calculateTax(double subtotal) {

        double tax = subtotal * taxPercentage / 100;
        return tax;
    }

    private static double calculateOverageFees(int overageMinutes) {

        double overageFees = minuteFee * overageMinutes;
        return overageFees;

    }

    private static int getOverageMinutes() {

        System.out.println("Enter overage minutes plan:");
        int overageMinutes = scanner.nextInt();
        return  overageMinutes;

    }

    private static double getPlanFee() {

        System.out.println("Enter the plan fee: ");
        double planFee = scanner.nextDouble();
        return planFee;

    }
}
