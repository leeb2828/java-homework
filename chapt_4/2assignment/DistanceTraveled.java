/* 
The distance a vehicle travels can be calculated as follows:
Distance = Speed * Time
For example, if a train travels 40 miles-per-hour for 3 hours, the distance traveled is
120 miles. 
Write a program that asks for 
- The speed of a vehicle (in miles-per-hour)
- The number of hours it has traveled. 
It should use a loop to display the distance a vehicle has traveled for each hour of a time 
period specified by the user. For example, if a vehicle is traveling at 40 mph for a three-hour 
time period, it should display a report similar to the one that follows:

Hour        Distance Traveled
-----------------------------
1           40
2           80
3           120

Input Validation: Do not accept a negative number for speed and do not accept any value
less than 1 for time traveled.
*/

import java.util.Scanner; 

public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int speed;
        int hours;
        
        System.out.print("Enter the speed of your vehicle (in miles-per-hour): ");
        speed = scan.nextInt();
        System.out.print("Enter the number of hours traveled: ");
        hours = scan.nextInt();

        System.out.println("Hour\t\tDistanced Traveled");
        System.out.println("----------------------------------");
        for (int i = 1; i <= hours; i++) {
            System.out.printf("%s \t\t %s \n", i, (speed * i));
        }

        scan.close();
    }
}