/* 
Write a program that asks the user to enter five test scores. The program should display
a letter grade for each score and the average test score. Write the following methods in
the program:
• calcAverage() —This method should accept five test scores as arguments and return the
average of the scores.
• determineGrade() —This method should accept a test score as an argument and return a
letter grade for the score, based on the following grading scale:
Score           Letter Grade
----------------------------
90-100          A
80-89           B
70-79           C
60-69           D
Below 60        F
*/

import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // Get scores from the user
        System.out.println("Please enter 5 test scores.");
        System.out.print("Score 1: ");
        int score1 = keyboard.nextInt();
        System.out.print("Score 2: ");
        int score2 = keyboard.nextInt();
        System.out.print("Score 3: ");
        int score3 = keyboard.nextInt();
        System.out.print("Score 4: ");
        int score4 = keyboard.nextInt();
        System.out.print("Score 5: ");
        int score5 = keyboard.nextInt();

        // Calculate the average grade and display it
        int average = calcAverage(score1, score2, score3, score4, score5);
        System.out.println("Average: " + average);

        // Determine the letter grades
        char grade1 = determineGrade(score1);
        char grade2 = determineGrade(score2);
        char grade3 = determineGrade(score3);
        char grade4 = determineGrade(score4);
        char grade5 = determineGrade(score5);

        // Display the letter grades
        System.out.printf("First grade: %c Second grade: %c  Third grade: %c Fourth grade: %c Fifth grade: %c \n", grade1, grade2, grade3, grade4, grade5);

        keyboard.close();
    }

    /* 
    Accepts five test scores as arguments and returns the average of the scores. 
    */
    public static int calcAverage(int first, int second, int third, int fourth, int fifth) {
        int scores_combined = first + second + third + fourth + fifth;
        int number_of_scores = 5;

        return scores_combined / number_of_scores;
    }

    /*
    Accept a test score as an argument and return a
    letter grade for the score.
    * Instead of if-else if-else statements, you can use the ternary (? :) operator. 
      Here is an example of a simple ternary statement. Try it out for yourself:
           String var = (2 == 2)? "correct": "incorrect";
           System.out.println(var); // prints out a string that was assigned "correct".
    */
    public static char determineGrade(int score) {
        char grade = (score > 89)? 'A': (score > 79 && score < 90)? 'B': (score > 69 && score < 80)? 'C': (score > 59 && score < 70)? 'D': (score < 60)? 'F': '0';
        
        /*
        char grade = ' ';
        if (score > 89) {
            grade = 'A';
        }
        else if (score > 79 && score < 90) {
            grade = 'B';
        }
        else if (score > 69 && score < 80) {
            grade = 'C';
        }
        else if (score > 59 && score < 70) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }
        */

        return grade;
    }

    /*
    FOR EXTRA CREDIT:
    NOTE: the "int... args" allows this method to accept an known number of integer arguments 
    if you wanted to allow the user to enter as many test scores as they wanted.
    Look up Variable Arguments (Varargs) in Java to learn more.
    */
    public static void displayScores(int... scores) {
        for (int score: scores) {
            System.out.print(score + " ");
        }

        System.out.printf("\nHere is the first score: %d \n", scores[0]);
    }

}