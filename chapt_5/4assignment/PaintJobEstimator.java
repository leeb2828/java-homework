/* 
A painting company has determined that for every 115 square feet of wall space, one gallon
of paint and eight hours of labor will be required. The company charges $18.00 per hour
for labor. Write a program that allows the user to enter the number of rooms to be painted
and the price of the paint per gallon. It should also ask for the square feet of wall space in
each room. 

The program should have methods that return the following data:
• The number of gallons of paint required 
• The hours of labor required 
• The cost of the paint 
• The labor charges
• The total cost of the paint job
Then it should display the data on the screen.
*/

import java.util.Scanner; 

public class PaintJobEstimator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* Get information from the user */
        System.out.print("Enter the number of rooms that need to be painted: ");
        int user_number_of_rooms = scan.nextInt();

        System.out.print("Enter the price of the paint per gallon: $");
        double user_price_per_gallon = scan.nextDouble();

        System.out.print("Enter the square feet of wall space in each room: ");
        int user_square_feet = scan.nextInt();

        int user_total_square_feet = user_square_feet * user_number_of_rooms;

        /* Calculate costs */

        Double gallons_of_paint_required = gallonsRequired(user_total_square_feet);
        int hours_of_labor_required = hoursOfLaborRequired(user_total_square_feet);
        Double total_paint_cost = totalCostOfPaint(gallons_of_paint_required, user_price_per_gallon);
        Double total_labor_cost = totalLaborCharge(hours_of_labor_required);

        /* Display total amounts and costs */
        System.out.println("\n CALCULATED COSTS");
        System.out.println("-------------------");
        System.out.printf("Gallons of paint required: %.1f gallons. \n", gallons_of_paint_required);
        System.out.printf("Hours of labor required: %d hours \n", hours_of_labor_required);
        System.out.printf("Total cost of the paint: $%.2f \n", total_paint_cost);
        System.out.printf("Total cost of the labor: $%.2f \n", total_labor_cost);


        scan.close();
    }

    /**
     * Takes in the total square feet and returns
     * the gallons of paint required.
     */
    public static Double gallonsRequired(int total_square_feet) {
        // 1 gallon of paint per 115 total square feet
        return ((double)total_square_feet / 115);
    }
    
    /*
    * Takes in the total square feet and returns
    * the hours of labor required
    */
    public static int hoursOfLaborRequired(int total_square_feet) {
        // 115 square feet requires 8 hours of labor
        return (8 * (int)total_square_feet) / 115;
    }

    /*
    * Takes in the total gallons of paint and the price per gallon of paint 
    * and returns the total cost of the paint.
    */
    public static Double totalCostOfPaint(double total_gallons_of_paint, double price_per_gallon) {
        return total_gallons_of_paint * price_per_gallon;
    }

    /*
    * Takes in the total hours of labor and
    * return the total cost of the labor.
    */
    public static Double totalLaborCharge(int total_hours_of_labor) {
        // $18 an hour for labor
        double cost_per_hour = 18.00;
        return total_hours_of_labor * cost_per_hour;
    }
}