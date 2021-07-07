/* 
When an object is falling because of gravity, the following formula can be used to determine
the distance the object falls in a specific time period:
d = 1/2gt^2

The variables in the formula are as follows: 
- d is the distance in meters, 
- g is 9.8, and 
- t is the amount of time, in seconds, that the object has been falling.

Write a method named fallingDistance() that accepts an object’s falling time (in seconds) as
an argument. The method should return the distance, in meters, that the object has fallen
during that time interval. Demonstrate the method by calling it in a loop that passes the
values 1 through 10 as arguments, and displays the return value.
*/


public class FallingDistance {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            double distance = fallingDistance(i);
            System.out.printf("Seconds=%d  %.1f meters \n", i, distance);
        }

    }
    
    /* 
    * Accepts an object's falling time in seconds. 
    * Returns the distance (in meters) that the object has fallen
    * during that time.
    * Formula: d=1/2gt^2
    */
    public static Double fallingDistance(int input_seconds) {
        double seconds = (double)input_seconds;

        double t = Math.pow(seconds, 2.0);
        double g = 9.8;
        double one_half = (double)1/2;

        double distance = ( one_half * g * t );

        return distance;
    }
}