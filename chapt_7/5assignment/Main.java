/**
 * Write a program that accepts 
 * - the total number of items that a person purchases at a grocery store.
 * - the price of each grocery item purchased. 
 * The program should read the prices into an array and display the total 
 * amount spent in purchasing the grocery items.
 */

import java.util.ArrayList; 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the total number of grocery items purchased: ");
        int num_of_items = scan.nextInt(); 
        
        ArrayList<Double> grocery_list = new ArrayList<Double>(num_of_items);
        
        int num = 1;
        while (num <= num_of_items) {
            System.out.printf("Enter the price of the item #%d: $", num);
            double price = scan.nextDouble();
            grocery_list.add(price);
            num++;
        }

        double sum = 0;
        for (Double item: grocery_list) {
            sum += item;
        }

        System.out.printf("Total amount spent is: $%.2f\n", sum);

    }
}