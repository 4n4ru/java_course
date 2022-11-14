package chapter4_homework;

import java.util.Random;

/**
 * The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
 * 1) Roll the die for the user (generate a random number between 1 - 6) and advance the user that number
 * of spaces on the game board.
 * 2) After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
 * 3) Repeat this for 5 rolls in total.
 * 4) If the user gets to 20 before 5 rolls, end the game - they've won
 * 5) If they are greater than or less than 20 spaces exactly, they loose
 * 6) Remember there are only 20 spaces on the board, so a message like "You advanced to space 22" is a bug.
 */

public class RollTheDie {

    public static void main(String args[]){

        // Known variables
        int spaces = 20;
        int rolls = 5;
        int spacesAdvanced = 0;

        for (int i = 0; i < rolls; i ++){
            Random random = new Random();
            int die = random.nextInt(6) + 1;
            System.out.println("You have rolled a " + die);
            spacesAdvanced += die;
            if (spacesAdvanced == spaces) {
                System.out.println("Congratulations you have won the game!");
                break;
            } else if (spacesAdvanced > spaces){
                System.out.println("Sorry, you have gone too far");
                break;
            } else if (spacesAdvanced < spaces && i == rolls - 1){
                System.out.println("Sorry, you loose, you have not reached the end of the board, you missed by " + (spaces - spacesAdvanced));
            } else {
                System.out.println("You are now on space " + spacesAdvanced + ". You have " + (spaces - spacesAdvanced) + " to go.");
            }
        }

    }
}
