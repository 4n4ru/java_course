package chapter5;

import com.sun.org.apache.bcel.internal.generic.PUSH;

import java.util.Scanner;

/**
 * Variable scope
 * Write an 'instant credit check' program that approves
 * anyone who makes more than %25,000 and has a credit score
 * of 700 or better. Reject all others.
 */

public class InstantCreditCheck {

    // Initialize what we know
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){


        // Get what we don't know
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        // Check if the user is qualified
        boolean qualified = isUserQualified (salary, creditScore);

        // Notify the user
        informUser(qualified);
    }

    public static double getSalary(){
        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();
        return salary;
    }
    public static int getCreditScore(){
        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        return creditScore;
    }
    public static boolean isUserQualified (double salary, int creditScore){
        boolean qualified = false;
        if (salary >= requiredSalary && creditScore >= requiredCreditScore){
            qualified = true;
        }
        return  qualified;
    }

    public static void informUser (boolean qualified){
        if (qualified){
            System.out.println("You have qualified for a loan.");
        } else {
            System.out.println("You have not qualified for a loan.");
        }
    }
}
