/*
A cylindrical vessel has a radius of 7 cm and a height of 8 cm. Write a program that calcu-
lates the volume of this vessel using the following formula: volume of cylinder = 3.14 *
(radius) 2 * height
*/
public class Main {
    public static void main(String[] args) {
        // radius and height in cm
        int radius = 7;
        int height = 8;
        
        double volume = 3.14 * (Math.pow(radius, 2.0)) * height;

        System.out.println("With a radius of " + radius +" and a " +
        "height of " + height + ", the volume is " + volume + " .");
    }
}