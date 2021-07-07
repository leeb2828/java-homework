import java.util.Scanner; 
import java.util.ArrayList; 

public class Main {
    public static void main(String[] args) {
        /* Allow the user to enter each student’s name and his
         or her four test scores. It should then display each student’s 
         average test score and letter grade. */
        Scanner scan = new Scanner(System.in);
        String name;
        double[] scores;
        int num_of_tests = 4;
        int num_of_students = 5;

        ArrayList<Student> students = new ArrayList<Student>();
        
        // Create all the student objects and add them to the "students" ArrayList
        for (int i = 0; i < num_of_students; i++) {
            name = get_name_from_user(scan);
            scores = get_scores_from_user(scan, num_of_tests);
            Student studente = new Student(name, scores);
            students.add(studente);
        }

        scan.close();
        
        // Display all student information
        for (Student stu: students) {
            stu.display_all_info();
        }
        
    }

    public static String get_name_from_user(Scanner scan) {
        // Get the name for the student from the user
        System.out.print("Enter the name for the student: ");
        String name = scan.nextLine();
    
        return name;
    }

    public static double[] get_scores_from_user(Scanner scan, int num_of_tests) {
        double[] scores = new double[num_of_tests];
        // Get the scores of the student from the user
        System.out.print("Enter " + num_of_tests + " scores for this student on the same line, separated by spaces: ");
        int i = 0;
        while (i < num_of_tests) {
            scores[i] = scan.nextDouble();
            i += 1;
        }
        scan.nextLine(); // this keeps the Scanner object from freezing up

        // check if scores are valid
        for (double score: scores) {
            int x = (int)score;
            if (x < 0 || x > 100) {
                System.out.println("Test scores cannot be less than 0 or greater than 100!");
                return get_scores_from_user(scan, num_of_tests);
            }
        }

        return scores;
    }

}