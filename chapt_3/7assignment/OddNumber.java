import java.util.Scanner;
/*
Write a program that asks the user to enter a number, and then checks whether it is an odd
number or not. If the number is odd, the program should display “The number is an odd
number.”
*/

public class OddNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int user_number = scan.nextInt();

        if(user_number % 2 != 0) {
            System.out.println("The number is an odd number");
        } else {
            System.out.println("The number is an even numer");
        }
    }
}