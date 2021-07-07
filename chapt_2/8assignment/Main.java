/*
A bag of cookies holds 40 cookies. The calorie information on the bag claims that there are
10 servings in the bag and that a serving equals 300 calories. Write a program that lets the
user enter the number of cookies he or she actually ate and then reports the number of total
calories consumed.
*/

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int total_cookies_per_bag = 40;
        int total_servings_per_bag = 10;
        int calories_in_one_serving = 300;

        int total_cookies_per_serving = total_cookies_per_bag / total_servings_per_bag;
        int calories_per_cookie = calories_in_one_serving / total_cookies_per_serving;
        
        // Get user input
        String user_input = JOptionPane.showInputDialog("Enter the total number of cookies you ate: ");
        int cookies_eaten = Integer.parseInt(user_input);

        // Display the results
        JOptionPane.showMessageDialog(null, "The total number of calories you consumed was " + 
        cookies_eaten * calories_per_cookie);


    }
}