/*
Write a program that asks the user to enter an item’s wholesale cost and its markup percent-
age. It should then display the item’s retail price. For example:
• If an item’s wholesale cost is 5.00 and its markup percentage is 100 percent, then the
  item’s retail price is 10.00.
• If an item’s wholesale cost is 5.00 and its markup percentage is 50 percent, then the
  item’s retail price is 7.50.

The program should have a method named calculateRetail that receives the wholesale
cost and the markup percentage as arguments, and returns the retail price of the item. 
*/

import java.util.Scanner;

public class RetailPriceCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the item's wholesale cost: $");
        double wholesale_cost = scan.nextDouble();
        System.out.print("Enter its markup percentage: ");
        int markup = scan.nextInt();

        double retail_price = calculateRetail(wholesale_cost, markup);
        System.out.printf("The retail price of the item is $%.2f \n", retail_price);

        scan.close();
    }

    public static Double calculateRetail(double wholesale, int markup) {
        double added_cost = wholesale * markup/100;
        double retail_cost = wholesale + added_cost;
        return retail_cost;
    }
}