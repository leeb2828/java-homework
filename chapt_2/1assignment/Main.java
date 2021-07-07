/**
 Write a program that declares the following:
    • a String variable named name
    • an int variable named age
    • a double variable named annualPay

Store your age, name, and desired annual income as literals in these variables. The program
should display these values on the screen in a manner similar to the following:

My name is Joe Mahoney, my age is 26 and I hope to earn $100000.0 per year.
 */

public class Main {
    
    public static void main(String[] args) {
        String name = "Joe";
        int age = 26;
        double annualPay = 100000.00;

        System.out.println("My name is " + name + ", my age is " + age + " and I" +
        " hope to earn " + annualPay + " per year.");


    }
}

/* 
CLASS NOTES:
The "S" in String is written in an uppercase letter, because the first character 
of a class name is always written in an uppercase letter. String is a CLASS, not a 
primitive data type. int or double are primitive data types.
String literals are enclosed in double-quotation marks, such as "Hi" or "A".
Character literals are enclosed in single quotation marks, such as 'A' or 'B'. 
*/