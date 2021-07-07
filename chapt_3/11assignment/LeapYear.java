/*
Write a program that asks the user to enter a year and then checks whether it is a leap year
or not. If it is a leap year, the program should display the message “The year is a leap year.”
*/
import java.util.Scanner; 

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scan.nextInt();

        boolean condition1 = year % 100 == 0;
        boolean condition2 = year % 400 == 0;

        boolean condition1_opposite = year % 100 != 0;
        boolean condition3 = year % 4 == 0;
        
        // Must divide evenly into 100 and 400
        if (condition1 && condition2) {
            System.out.println("The year is a leap year.");
        }
        // Divide evenly into 4 but not 100
        else if (condition1_opposite && condition3) {
            System.out.println("The year is a leap year.");
        }
        else {
            System.out.println("The year is NOT a leap year.");
        }

        scan.close();
    }
}