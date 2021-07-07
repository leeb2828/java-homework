/* 
Write a program that calculates the amount a person would earn over a period of time if his
or her salary is 
- one penny the first day
- two pennies the second day 
- and continues to DOUBLE each day. 
The program should display a table showing the 
- salary for each day.
- show the total pay at the end of the period. 
The output should be displayed in a dollar amount, not the number of pennies.
Input Validation: Do not accept a number less than 1 for the number of days worked.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int days_worked = 0;
        Scanner scan = new Scanner(System.in);
        
        while (days_worked < 1) {
            System.out.print("Enter the number of days worked (1 or more days): ");
            days_worked = scan.nextInt();
            System.out.println();
        }

        // Close the Scanner object
        scan.close();

        // Print the table
        System.out.println("Day\t\t\tSalary"); 
        System.out.println("--------------------------------"); 

        
        int total_pennies = 1;
        int grand_total = 0;
        String tabspace = "\t\t\t";
        for (int day = 1; day <= days_worked; day++, total_pennies = total_pennies * 2) {
            // Used "typecasting" to convert integer into a double
            double salary = (double)total_pennies / 100;
            System.out.printf("| %d %s $%.2f |\n", day, tabspace, salary);
            grand_total += total_pennies;
        }
        System.out.println("--------------------------------");
        System.out.printf("\nTotal amount: $%.2f \n", ((double)grand_total / 100) );

    }
}