/* 
Write a program that asks the user to enter a distance in meters. The program will then pre-
sent the following menu of selections:
1. Convert to kilometers
2. Convert to inches
3. Convert to feet
4. Quit the program
The program will convert the distance to kilometers, inches, or feet, depending on the user’s
selection. Here are the specific requirements:

• Write a void method named showKilometers() , which accepts the number of meters as
an argument. The method should display the argument converted to kilometers. Convert 
the meters to kilometers using the following formula:
kilometers = meters * 0.001
• Write a void method named showInches() , which accepts the number of meters as an
argument. The method should display the argument converted to inches. Convert the
meters to inches using the following formula:
inches = meters * 39.37
• Write a void method named showFeet() , which accepts the number of meters as an
argument. The method should display the argument converted to feet. Convert the
meters to feet using the following formula:
feet = meters * 3.281
• Write a void method named menu() that displays the menu of selections. This method
should not accept any arguments.
• The program should continue to display the menu until the user enters 4 to quit the
program.
• The program should not accept negative numbers for the distance in meters.
• If the user selects an invalid choice from the menu, the program should display an
error message.
*/

import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int option = 0;

        System.out.print("Enter a distance in meters: ");
        int user_meters = keyboard.nextInt();

        // while the user hasn't quit the program
        while(option != 4) {
            // display menu
            menu();
            // get user input (question asked inside the menu() method)
            option = keyboard.nextInt();
            // display value based on user input
            selectedOption(option, user_meters);

        }

        keyboard.close();
    }

    // Displays the menu of selections.
    public static void menu() {
        System.out.println("1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program");

        System.out.print("\n\nEnter your choice: ");
    }

    // This method was not required, I added it for convenience.
    public static void selectedOption(int option, int meters) {
        if (option == 1) {
            showKilometers(meters);
        }
        else if (option == 2) {
            showInches(meters);
        } 
        else if (option == 3) {
            showFeet(meters);
        }
        else {
            System.out.println("Bye!");
        }
        
    }

    /* Accepts the number of meters as
    an argument. The method should display the argument 
    converted to kilometers.
    Formula: kilometers = meters * 0.001
    */
    public static void showKilometers(int meters) {
        double kilometers = (double)meters * 0.001;
        System.out.printf("%d meters is %.1f kilometers.\n\n", meters, kilometers);
    }

    /* Accepts the number of meters as an
    argument. The method should display the argument converted to inches.
    Formula: inches = meters * 39.37
    */
    public static void showInches(int meters) {
        double inches = (double)meters * 39.37;
        System.out.printf("%d meters is %.1f inches.\n\n", meters, inches);
    }

    /* Accepts the number of meters as an
    argument. The method should display the argument converted to feet. 
    Formula: feet = meters * 3.281
    */
    public static void showFeet(int meters) {
        double feet = (double)meters * 3.281;
        System.out.printf("%d meters is %.1f feet.\n\n", meters, feet);
    }
}