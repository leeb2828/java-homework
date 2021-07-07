/*
Write a program that asks the user to enter the name of his or her favorite city. Use a String
variable to store the input. The program should display the following:
• The number of characters in the city name
• The name of the city in all uppercase letters
• The name of the city in all lowercase letters
• The first character in the name of the city
*/

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String user_input = JOptionPane.showInputDialog("Enter the name of your favorite city: ");

        int stringSize = user_input.length();
        String all_uppercase = user_input.toUpperCase();
        String all_lowercase = user_input.toLowerCase();
        // Convert the character to a string and plug it into first_index
        String first_index = String.valueOf(user_input.charAt(0));

        JOptionPane.showMessageDialog(null, "The number of letters in that city is " +
        stringSize + "\n" + all_uppercase + "\n" + all_lowercase + "\n" + "The " +
        "character at the first index is " + first_index);

    }
}