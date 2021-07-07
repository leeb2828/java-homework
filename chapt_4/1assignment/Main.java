import java.util.Scanner;

/*
Write a program that displays a multiplication table. The program should ask the user to
enter a number and also the range up to which the user wants to display the multiplication
table. For example, the multiplication table for the number 3 up to range 2 would look like:
3 X 1 = 3 
3 X 2 = 6
*/

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int user_number = scan.nextInt();

        System.out.print("Enter a range: ");
        int user_range = scan.nextInt();

        // Close the Scanner object
        scan.close();

        for (int i = 1; i <= user_range; i++) {
            int answer = user_number * i;
            System.out.printf("%d X %d = %d\n", user_number, i, answer);
        }

    }
}