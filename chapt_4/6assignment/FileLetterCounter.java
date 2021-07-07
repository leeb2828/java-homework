/* 
Write a program that asks 
- the user to enter the name of a file. 
- Asks the user to enter a character. 
The program should count and display the number of times that the specified 
character appears in the file. Use Notepad or another text editor to create a 
simple file that can be used to test the program.
*/

import java.util.Scanner; 
import java.io.*; 

public class FileLetterCounter {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);

        // Get the filename from user
        System.out.print("Enter the name of the file: "); // enter -> friends.txt
        String filename = scan.nextLine();
        System.out.print("Enter a single letter: "); // enter -> e
        char user_character = scan.nextLine().charAt(0);

        File file = new File(filename);

        int total_characters_found = 0;

        // if the file the user entered exists
        if (file.exists()) {
            // Open file  
            Scanner inputFile = new Scanner(file);

            while(inputFile.hasNextLine()) {   
                String line = inputFile.nextLine();
                
                for(int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);
                    // if the current character equals the user's character
                    if (ch == user_character) {
                        total_characters_found++;
                    }
                }
            }

            // Close the file object
            inputFile.close(); 

            System.out.printf("'%c' appeared %s times in %s \n", user_character, total_characters_found, filename);
        } 
        else {
            System.out.println(filename + " does not exist in this directory.");
        }

        // close the scanner object
        scan.close();

    }
}