/*
Write a program that prompts the user to enter a number within the range of 1 through 10.
The program should display the Roman numeral version of that number. If the number is
outside the range of 1 through 10, the program should display an error message.
*/

import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner input_obj = new Scanner(System.in);
        System.out.print("Enter a number within the range of 1 through 10 : ");
        int user_number = input_obj.nextInt();
        String roman_numeral;

        switch (user_number) {
            case 1:
                roman_numeral = "I";
                break;
            case 2:
                roman_numeral = "II";
                break;
            case 3:
                roman_numeral = "III";
                break;
            case 4:
                roman_numeral = "IV";
                break;
            case 5:
                roman_numeral = "V";
                break;
            case 6:
                roman_numeral = "VI";
                break;
            case 7:
                roman_numeral = "VII";
                break;
            case 8:
                roman_numeral = "VIII";
                break;
            case 9:
                roman_numeral = "IX";
                break;
            case 10:
                roman_numeral = "X";
                break;
            default:
                roman_numeral = null;
        } // end of switch statement


        if (roman_numeral == null) {
            System.out.println("Error. Enter a value between 1 and 10");
        } else {
            System.out.printf("The roman numeral for %d is %s \n", user_number, roman_numeral);
        }
        
        // Alternative way to print this out
        String str = String.format("USER NUMBER: %d ROMAN NUMERAL: %s", user_number, roman_numeral);
        System.out.println(str);
    }
}