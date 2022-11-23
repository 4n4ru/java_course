package chapter7_homwework;

import java.util.Scanner;

/**
 * Make an array that holds the textual values of the days of the week.
 * Have the user input a number corresponding to the day of the week.
 * Assume the week starts on Monday.
 * Your program should output the String that represents the day of the week.
 * Example: User inputs the number 1, your program should print "Monday"
 */

public class DayOfTheWeek {

    public static void main(String[] args){
        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number for the day of the week:");
        int dayNumber = userInput.nextInt();
        userInput.close();

        System.out.println("The day of the week is: " + daysOfTheWeek[dayNumber - 1]);
    }

}
