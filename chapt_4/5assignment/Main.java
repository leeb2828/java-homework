import java.util.Scanner;

/* 
Write a program that asks the user to enter a Unicode decimal value that must lie either in
the range of 65 to 90 or 97 to 122. The program must use a user controlled loop to display
the letter (i.e. from A to Z or a to z) corresponding to the Unicode decimal value.
*/

/*
* ASCII TABLE
* 65 - 90  A-Z
* 97 - 11  a-z
*/

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int user_number = 0;

        boolean loop_control = true;
        boolean first = false; 
        boolean second = false; 
        
        // This loop will keep running until user enters a "valid" number
        while(loop_control) {
            System.out.print("Enter a number with the range of 65-90 OR 97-122: ");
            user_number = scan.nextInt();

            first = user_number > 64 && user_number < 92;
            second = user_number > 96 && user_number < 123;

            if (first || second) {
                loop_control = false;
            } else {
                System.out.println("You must enter a valid number. Try again!");
            }

        }

        // close the Scanner object
        scan.close();

        char user_char = (char)user_number;
        System.out.println("The unicode for number " + user_number + " is " + user_char + ".");
    }
}