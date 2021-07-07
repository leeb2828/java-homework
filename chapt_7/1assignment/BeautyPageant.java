/*
In the final round of a beauty pageant, the performance of the final 5 contestants is judged
by 3 judges. Write a class named BeautyPageant that allows a user to input the scores
given by 3 judges for each contestant. The program should print the following:
• Total score of each contestant
• Average score of all the five contestants
*/
import java.util.Scanner;

public class BeautyPageant {
    public static void main(String[] args) {
        // Create a two dimensional array with 5 rows and 3 columns.
        int[][] everyone_scores = new int[5][3];
        Scanner keyboard = new Scanner(System.in);

        int total_of_everyones_scores = 0;
        int num_of_scores = 15;
        // each contestants total scores
        int[] total_score_each_contestant = new int[5];

        for(int row = 0; row < everyone_scores.length; row++) {
            System.out.println("Each judge is going to give their score for contestant #" + (row+1) );
            int all_three_scores = 0;
            for (int col = 0; col < everyone_scores[row].length; col++) {
                System.out.println("Enter your score.");
                System.out.print("Judge#" + (col+1) + " > ");
                everyone_scores[row][col] = keyboard.nextInt();
                total_of_everyones_scores += everyone_scores[row][col];
                all_three_scores = all_three_scores + everyone_scores[row][col];
            }
            // add up all three scores for this contestant and add it to this array
           total_score_each_contestant[row] = all_three_scores;
        }

        System.out.println();
        for (int i = 0; i < total_score_each_contestant.length; i++){
            System.out.printf("Total score for contestant #%d: %d\n", (i+1), (total_score_each_contestant[i]) );
        }

        System.out.printf("Average score of all the five contestants: %d\n", (total_of_everyones_scores / num_of_scores) );

        keyboard.close();
    }
}