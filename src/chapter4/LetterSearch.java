package chapter4;

import java.util.Scanner;

/**
 * LOOP BREAK
 * Search a String to determine if it contains the letter 'A'.
 */

public class LetterSearch {

    public static void main(String args[]){

        // Get text
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();
        boolean letterFound = false;

        // Search text for letter A
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == 'A' || text.charAt(i) == 'a') {
                letterFound = true;
                break;
            }
        }
        if (letterFound){
            System.out.println("The letter A was found.");
        } else {
            System.out.println("The letter A was not found");
        }
    }

}
