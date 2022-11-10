package chapter2_homework;

import java.util.Scanner;

public class MadLibs {

    public static void main(String args[]){

        // Ask user for a season of the year
        System.out.println("Please enter a season of the year: ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();

        // Ask user fo a whole number
        System.out.println("Please enter a whole number: ");
        int number = Integer.parseInt(scanner.nextLine());

        // Ask user for an adjective
        System.out.println("Please enter an adjective: ");
        String adjective = scanner.nextLine();

        // Output sentence "On a [adjective][season of the year] day, I drink a minimum of [ whole number] cups of coffee."
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");

    }
}
