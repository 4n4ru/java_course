package chapter3;

import java.util.Scanner;

public class ChangeForDollar {

    public static void main(String args[]){

        int penny = 1;
        int nickel = 5;
        int dime = 10;
        int quarter = 25;
        int dollar = 100;

        System.out.println("Please enter a number of pennies:");
        Scanner scanner = new Scanner(System.in);
        int numPennies = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter the number of nickles:");
        int numNickles = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter the number of dimes:");
        int numDimes = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter the number of quarters:");
        int numQuarters = Integer.parseInt(scanner.nextLine());

        scanner.close();
        
        int guessTotal = numPennies * penny + numNickles * nickel + numDimes * dime + numQuarters * quarter;
        
        int difference;
        if (guessTotal == dollar){
            System.out.println("Congratulations! You have given the correct change.");
        } else if (guessTotal > dollar){
            difference = guessTotal - dollar;
            System.out.println("Your change went over 1 dollar by " + difference + " cents.");
        } else {
            difference = dollar - guessTotal;
            System.out.println("Your change is under a dollar by " + difference + " cents.");
        }

    }
}
