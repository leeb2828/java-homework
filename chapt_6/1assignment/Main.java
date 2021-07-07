/* 
Write a class named Employee that has the following fields:
• name. The name field references a String object that holds the employee’s name.
• idNumber. The idNumber is an int variable that holds the employee’s ID number.
• department. The department field references a String object that holds the name of
  the department where the employee works.
• position. The position field references a String object that holds the employee’s
  job title.

The class should have the following constructors:
• A constructor that accepts the following values as arguments and assigns them to the
  appropriate fields: employee’s name, employee’s ID number, department, and position.
• A constructor that accepts the following values as arguments and assigns them to the
  appropriate fields: employee’s name and ID number. The department and position
  fields should be assigned an empty string ( "" ).
• A no-arg constructor that assigns empty strings ( "" ) to the name , department , and
  position fields, and 0 to the idNumber field.

  Write appropriate mutator methods that store values in these fields and accessor methods
that return the values in these fields. Once you have written the class, write a separate pro-
gram that creates three Employee objects to hold the following data:
Name            ID Number      Department      Position
___________________________________
Susan Meyers    47899          Accounting      Vice President
Mark Jones      39119          IT              Programmer
Joy Rogers      81774          Manufacturing   Engineer

The program should store this data in the three objects and then display the data for each
employee on the screen.
*/
import java.util.Arrays; // Needed for Arrays.fill() method

public class Main {
    public static void main(String[] args) {
        String LONG_LINE = repeatChar('_', 120);
        // Create first employee with the first constructor method from Employee class
        Employee susan = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        
        // Create second employee using the second constructor method
        Employee mark = new Employee("Mark Jones", 39119);
        mark.setDepartment("IT");
        mark.setPosition("Programmer");

        // Create third employee using the third constructor method
        Employee joy = new Employee();
        joy.setName("Joy Rogers");
        joy.setIdNumber(81774);
        joy.setDepartment("Manufacturing");
        joy.setPosition("Engineer");
        
        System.out.println("Name\t\t\t\tId Number\t\t\tDepartment\t\t\t\tPosition");
        System.out.printf("%s \n", LONG_LINE);
        System.out.printf("%s\t\t\t %d\t\t\t\t%s\t\t\t\t%s\n", susan.getName(), +
        susan.getIdNumber(), susan.getDepartment(), susan.getPosition());

    }

    static String repeatChar(char c, int length) {
        char[] data = new char[length];
        Arrays.fill(data, c);
        return new String(data);
    }
    
    
}
