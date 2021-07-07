/* 
Write a class named PhoneBookEntry that has fields for a person’s name and phone number.
The class should have a constructor and appropriate accessor and mutator methods. Then
write a program that creates at least five PhoneBookEntry objects and stores them in an
ArrayList . Use a loop to display the contents of each object in the ArrayList .
*/
import java.util.ArrayList;  

public class Main {
    public static void main(String[] args) {
        ArrayList<PhoneBookEntry> phone_objects = new ArrayList<PhoneBookEntry>();

        // Create 5 Phone Book Objects
        PhoneBookEntry obj1 = new PhoneBookEntry("Sue", 3687039);
        PhoneBookEntry obj2 = new PhoneBookEntry("Steve", 3667039);
        PhoneBookEntry obj3 = new PhoneBookEntry("Jamie", 2687039);
        PhoneBookEntry obj4 = new PhoneBookEntry("Lin", 8687039);
        PhoneBookEntry obj5 = new PhoneBookEntry("Katie", 3687079);

        // Add objects to the ArrayList
        phone_objects.add(obj1);
        phone_objects.add(obj2);
        phone_objects.add(obj3);
        phone_objects.add(obj4);
        phone_objects.add(obj5);

        for (PhoneBookEntry obj: phone_objects) {
            System.out.println("Name: " + obj.name + "   Phone Number: " + obj.phone_number);
        }

    }
}