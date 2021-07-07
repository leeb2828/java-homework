/*
A slot machine is a gambling device that the user inserts money into and then pulls a lever
(or presses a button). The slot machine then displays a set of random images. If two or more
of the images match, the user wins an amount of money that the slot machine dispenses
back to the user.
Create a program that simulates a slot machine. When the program runs, it should do
the following:
• Asks the user to enter the amount of money he or she wants to enter into the slot machine.
• Instead of displaying images, the program will randomly select a word from the
following list:

Cherries, Oranges, Plums, Bells, Melons, Bars 

To select a word, the program can generate a random number in the range of 0
through 5. 
- If the number is 0, the selected word is Cherries. 
- If the number is 1, the selected word is Oranges; and so forth. 
The program should randomly select a word from this list three times and display all three of the words.
*/

import java.util.Random; 
import java.util.Scanner; 

public class SlotMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount of money you want to enter into the slot machine: $");
        Double user_amount = scan.nextDouble();

        Random rand = new Random();
        int number;

        String current_word = "";
        String first_word = "";
        String second_word = "";
        int matches = 0;

        for (int i = 1; i < 4; i++) {
            number = rand.nextInt(6); // inclusive of 0, exclusive of 6.
            
            // NOTE: The user must get three identical items in order to 
            // win back their money!
            switch(number) {
                case 0:
                    System.out.println("Cherries");
                    current_word = "Cherries";
                    break;
                case 1:
                    System.out.println("Oranges");
                    current_word = "Oranges";
                    break;
                case 2:
                    System.out.println("Plums");
                    current_word = "Plums";
                    break;
                case 3:
                    System.out.println("Bells");
                    current_word = "Bells";
                    break;
                case 4:
                    System.out.println("Melons");
                    current_word = "Melons";
                    break;
                case 5:
                    System.out.println("Bars");
                    current_word = "Bars";
                    break;
                default:
                    System.out.println("None");
            }

            if (current_word.equals(first_word) || current_word.equals(second_word)) {
                // the "matches" variable will equal to 2 only if all three items are identical
                matches++;
            }

            // Assign the first selected item to the "first_word" variable, when 
            // the current index is 1
            if (i == 1) {
                first_word = current_word;
            }
            // Assign the second selected item to the "second_word" variable, when
            // the current index is 2
            else if (i == 2) {
                second_word = current_word;
            }

        } 
        
        // If all three items are identical to each other
        if(matches == 2) {
            System.out.printf("You won back your $%.2f !\n", user_amount);
        } else {
            System.out.println("\nTry again!");
        }
        
        scan.close();
    }
}