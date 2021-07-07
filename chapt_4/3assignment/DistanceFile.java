/*
Modify the program you wrote for Programming Challenge 2 (Distance Traveled) so it
writes the report to a file instead of the screen. Open the file in Notepad or another text
editor to confirm the output.

CONCEPT: The Java API provides several classes that you can use for writing data to
a file and reading data from a file. To write data to a file, you can use the
PrintWriter class and, optionally, the FileWriter class. To read data
from a file, you can use the Scanner class and the File class.
*/

import java.util.Scanner; 
import java.io.*;

public class DistanceFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name of the .txt file: "); // Data.txt
        String filename = scan.nextLine();

        /* Keep all of this code in the try and catch blocks. You have to tell 
        the compiler that there is a chance to throw a FileNotFoundException 
        if the file does not exist. PrintWriter class object requires it. */
        try {
            PrintWriter outputfile = new PrintWriter(filename); 

            int speed;
            int hours;
            
            System.out.print("Enter the speed of your vehicle (in miles-per-hour): "); // 40
            speed = scan.nextInt();
            System.out.print("Enter the number of hours traveled: "); // 3
            hours = scan.nextInt();

            outputfile.println("Hour\t\tDistanced Traveled");
            outputfile.println("----------------------------------");
            for (int i = 1; i <= hours; i++) {
                outputfile.printf("%s \t\t     %s \n", i, (speed * i));
            }

            scan.close();
            outputfile.close();

            System.out.println("Your " + filename + " should be created.");
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found!!!");
        }

    }
}