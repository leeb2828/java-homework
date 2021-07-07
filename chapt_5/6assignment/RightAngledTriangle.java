/* 
A triangle in which one angle is equal to 90 degrees is known as a right-angled triangle.
When three sides of a triangle are given, the following formula can be used to check if a
triangle is right-angled.
- - - - >   (Hypotenuse)^2 = (Base)^2 + (Perpendicular)^2
Note: The perpendicular is the height, the hypotenuse is the longest side, and the base is the bottom.
where the hypotenuse is the longest side of the triangle and is the side opposite the right
angle. Write a method named Triangle() that accepts the three sides of a triangle as argu-
ments and checks whether or not the given triangle is a right-angled triangle.
*/

import java.util.Scanner; 

public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the hypotenuse of the triangle: ");
        int hypotenuse_angle = keyboard.nextInt();
        System.out.print("Enter the base of the triangle: ");
        int base_angle = keyboard.nextInt();
        System.out.print("Enter the height of the triangle: ");
        int height_angle = keyboard.nextInt();

        Triangle(hypotenuse_angle, base_angle, height_angle);

    }

    /*
    * Accepts the three sides of a triangle as arguments and 
    * checks whether or not the given triangle is a right-angled triangle.
    * Formula: (Hypotenuse)^2 = (Base)^2 + (Perpendicular)^2
    */
    public static void Triangle(int the_hypotenuse, int the_base, int the_height) {
        the_hypotenuse = (int)Math.pow(the_hypotenuse, 2);
        the_base = (int)Math.pow(the_base, 2);
        the_height = (int)Math.pow(the_height, 2);

        if (the_hypotenuse == (the_base + the_height)) {
            System.out.println("This is a right-angled triangle");
        } else {
            System.out.println("This is not a right-angled triangle");
        }
    }
}