import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int user_option = 0;

        // Create the line class object
        LunchLine cafe_line = new LunchLine();

        while (user_option != 3) {
            cafe_line.displayEntireList();
            Menu.displayMenu();
            user_option = scan.nextInt();

            if (user_option != 3) {
                Menu.selection(user_option, cafe_line, scan);
            }
        }

        scan.close();
    }
  
}
