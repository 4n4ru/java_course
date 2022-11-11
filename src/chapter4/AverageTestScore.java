package chapter4;

import java.util.Scanner;

/**
 * NESTED LOOPS:
 * Find the average of each student's test scores
 */
public class AverageTestScore {

    public static void main(String arg[]){

        // Initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        // Process all students
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numberOfStudents; i++){
            int scoreSum = 0;
            for (int j = 0; j < numberOfTests; j++){
                System.out.println("Enter the score for test #" + (j + 1) + " for student #" + (i + 1));
                scoreSum = scoreSum + scanner.nextInt();
            }
            double average = scoreSum / numberOfTests;
            System.out.println("The average test score of student #" + (i + 1) + " is " + average);
        }

        scanner.close();
    }
}
