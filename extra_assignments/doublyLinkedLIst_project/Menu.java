import java.util.Scanner; 

public class Menu {
    public Menu() {}

    public static void displayMenu() {
        System.out.println("\nPick a number option: ");
        System.out.println("1.) Create a student to add to the line.");
        System.out.println("2.) Remove a student from the line");
        System.out.println("3.) Quit the program");
        System.out.print("\n> ");
    }


    public static void selection(int user_choice, LunchLine line_of_students, Scanner keyboard) {
        if (user_choice == 1) {
            create_and_add_student(line_of_students, keyboard);
        }
        else if (user_choice == 2) {
            remove_student(line_of_students, keyboard);
        }
        else {
            System.out.println("Invalid option");
        }
    }


    public static void create_and_add_student(LunchLine line_of_students, Scanner scan) {
        scan.nextLine();

        System.out.print("(String) Enter the name of the student: ");
        String name = scan.nextLine();
        System.out.print("(Integer) Enter the age of the student: ");
        int age = scan.nextInt();
        System.out.print("(Integer) What grade is the student in?: ");
        int grade = scan.nextInt();

        // Create the student object
        Student new_student = new Student(name, age, grade);

        System.out.println("\nShould this student be placed at the front or back of the lunch line?");
        System.out.println("1.) Front  2.) Back\n");
        System.out.print("> ");
        int choice = scan.nextInt();

        if (choice == 1) {
            line_of_students.insertFirst(new_student);
        } 
        else {
            line_of_students.insertLast(new_student);
        }

        System.out.println();
    }


    // remove_student(line_of_student, keyboard);
    public static void remove_student(LunchLine line_of_students, Scanner scan) {
        System.out.println("Remove a student from the front or back of the lunch line?");
        System.out.println("8.) Front  9.) Back\n");
        System.out.print("> ");
        int choice = scan.nextInt();

        if (choice == 8) {
            line_of_students.deleteFirstStudent();
        }
        else if (choice == 9) {
            line_of_students.deleteLastStudent();
        }
        else {
            System.out.println("Invalid option");
        }

        System.out.println();
        
    }



}