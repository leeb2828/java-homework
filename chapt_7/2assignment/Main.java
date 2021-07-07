import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ID_list = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
        Payroll pay_roll = new Payroll();


        int num = 1;
        for (int id: ID_list) {
            System.out.printf("For employee #%d ID #%d\n", num, id);

            // GET EMPLOYEE HOURS FROM USER
            int hours = get_hours_from_user(id, scan);
            pay_roll.set_hours(id, hours);
            
            // GET EMPLOYEE PAYRATE FROM USER
            double payrate = get_payrate_from_user(id, scan);
            pay_roll.set_payrate(id, payrate);

            // SET GROSS WAGE FOR EMPLOYEE
            pay_roll.set_gross_pay(id);
            double gross_pay = pay_roll.get_gross_pay(id);

            // DISPLAY GROSS WAGE
            System.out.printf("The total gross pay for this employee is $%.2f\n\n", gross_pay);

            num++;
        }


        pay_roll.display_all();
    
    }


    public static int get_hours_from_user(int id, Scanner scan) {
        boolean no_hours = true;
        int hours = 0;
        while(no_hours) {
            System.out.print("Enter the employee's hours: ");
            hours = scan.nextInt();
            if (hours >= 0) {
                no_hours = false;
            } else {
                System.out.println("Requirement: No negative numbers and input must be in integer form.");
            }
        }
        return hours;    
    }

    
    public static double get_payrate_from_user(int id, Scanner scan) {
        boolean no_payrate = true;
        double payrate = 0.0;
        while(no_payrate) {
            System.out.print("Enter the employee's pay rate: $");
            payrate = scan.nextDouble();
            if (payrate >= 6.00) {
                no_payrate = false;
            } else {
                System.out.println("Requirement: No numbers less than 6.00.");
            }
        }
        return payrate;
    }


}