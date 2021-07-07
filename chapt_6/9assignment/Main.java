import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int month = 0;
        int year = 0;

        do {
            System.out.print("Enter a month (1-12): ");
            month = scan.nextInt();
            System.out.print("Enter a year: ");
            year = scan.nextInt();
        } while (month < 0 || month > 12);

        MonthDays obj = new MonthDays(month, year);
        int num_days = obj.getNumberOfDays(month);
        System.out.println(num_days + " days");
    }
}