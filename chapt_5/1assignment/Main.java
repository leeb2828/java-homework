/**
Write a method named showChar . The method should accept two arguments: a reference to
a String object and an integer. The integer argument is a character position within the
String , with the first character being at position 0. When the method executes, it should
display the character at that character position. Here is an example of a call to the method:

showChar("New York", 2);

In this call, the method will display the character w because it is in position 2. Demonstrate
the method in a complete program.
*/

public class Main {
    public static void main(String[] args) {
        showChar("New York", 0);
        showChar("New York", 1);
        showChar("New York", 2);

    }
    
    static void showChar(String str, int position) {
        char result = str.charAt(position);
        System.out.printf("The character at position %d is %s. \n", position, String.valueOf(result));
    }
 
}

/* 
Class notes:
The word "public" means that the method is publicly available to code outside the class.

The word "static" means that the method belongs to the class, not a specific object instantiated from the class.
It is possible to create a field or method that does not belong to any instance of a class. Such
members are known as static fields and static methods. When a value is stored in a static
field, it is not stored in an instance of the class. In fact, an instance of the class doesn’t even
have to exist in order for values to be stored in the class’s static fields. There will be only one copy of the field
in memory, regardless of the number of instances of the class that might exist.
When a class contains a static method, it isn’t necessary for an instance of the class to be
created in order to execute the method.
*/