/*
Write a program that asks the user to enter a month (in numeric form), a day, and a two-
digit year. The program should then determine whether the month times the day is equal
to the year. If so, it should display a message saying the date is magic. Otherwise, it should
display a message saying the date is not magic.
The date June 10, 1960, is special because when we write it in the following format, the
month times the day equals the year: 6/10/60
*/
import java.util.Scanner; 

public class MagicDate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int month, day, year;

        System.out.println("Enter a month, day, and two-digit year separated by spaces.");
        System.out.print("# # ##: ");
 
        month = scan.nextInt();
        day = scan.nextInt();
        year = scan.nextInt();

        if ((month * day) == year) {
            System.out.println("The date is magic.");
        } 
        else {
            System.out.println("The date is NOT magic.");
        }

        scan.close();


    }
}