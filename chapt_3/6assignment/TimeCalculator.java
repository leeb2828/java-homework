/*
Write a program that asks the user to enter a number of seconds.
• There are 60 seconds in a minute. If the number of seconds entered by the user is
greater than or equal to 60, the program should display the number of minutes in that
many seconds.
• There are 3,600 seconds in an hour. If the number of seconds entered by the user is
greater than or equal to 3,600, the program should display the number of hours in
that many seconds.
• There are 86,400 seconds in a day. If the number of seconds entered by the user is
greater than or equal to 86,400, the program should display the number of days in
that many seconds.
*/
import java.util.Scanner; 

public class TimeCalculator {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number of seconds: ");
        int number_of_seconds = scan.nextInt();

        System.out.println("\nCALCULATE TOTAL TIME");
        
        // the while-loop isn't covered until chapter 4
        while (number_of_seconds != 0) {
            // Show seconds
            if (number_of_seconds < 60) {
                System.out.printf("Number of seconds: %d \n", number_of_seconds);
                // reset "number_of_seconds" variable
                number_of_seconds = 0;
            }
            
            // Show minutes --> number_of_seconds ÷ 60
            else if (number_of_seconds >= 60 && number_of_seconds < 3600) {
                System.out.printf("Number of minutes: %d \n", (number_of_seconds / 60));
                // reset "number_of_seconds" variable before the while loop runs again
                number_of_seconds = number_of_seconds % 60;
            }
            
            // Show hours --> number_of_seconds ÷ 3600
            else if (number_of_seconds >= 3600 && number_of_seconds < 86400) {
                System.out.printf("Number of hours: %d \n", (number_of_seconds / 3600) );
                // reset "number_of_seconds" variable before the while loop runs again
                number_of_seconds = number_of_seconds % 3600;
            }
            
            // Show days --> number_of_seconds ÷ 86400
            else {
                System.out.printf("Number of days: %d. \n", (number_of_seconds / 86400) );
                // reset "number_of_seconds" variable before the while loop runs again
                number_of_seconds = number_of_seconds % 86400;
            }
        }
        
        // close the Scanner object
        scan.close();

    } // end main
}
