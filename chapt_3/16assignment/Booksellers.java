/*
Serendipity Booksellers has a book club that awards points to its customers based on the
number of books purchased each month. The points are awarded as follows:
• If a customer purchases 0 books, he or she earns 0 points.
• If a customer purchases 1 book, he or she earns 5 points.
• If a customer purchases 2 books, he or she earns 15 points.
• If a customer purchases 3 books, he or she earns 30 points.
• If a customer purchases 4 or more books, he or she earns 60 points.

Write a program that asks the user to enter the number of books that he or she has pur-
chased this month and then displays the number of points awarded.
*/
import java.util.Scanner;

public class Booksellers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of books you have purchased this month: ");
        int number_of_books = scan.nextInt();

        // Make the user does not enter a negative number
        while (number_of_books < 0) {
            System.out.print("Please enter a valid number: ");
            number_of_books = scan.nextInt();
        }

        int number_of_points = 0;

        switch (number_of_books) {
            case 0:
                break;
            case 1:
                number_of_points = 5;
                break;
            case 2:
                number_of_points = 15;
                break;
            case 3:
                number_of_points = 30;
                break;
            default:
                number_of_points = 60;
        }

        System.out.println("You have earned " + number_of_points + " points!");

        scan.close();

    }
    
}