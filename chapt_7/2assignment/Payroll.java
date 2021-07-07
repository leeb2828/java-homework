
public class Payroll {
    // employee identification numbers
    int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    private int SIZE = employeeId.length; // number of employees

    private int[] hours; // number of hours worked (by each employee)
    private double[] payRate; // each employee's hourly pay rate
    private double[] wages; // employee's gross wages

    public Payroll() {
        hours = new int[SIZE];
        payRate = new double[SIZE];
        wages = new double[SIZE];
    }

    public int find_index(int id) {
        for (int i = 0; i < SIZE; i++) {
            if (employeeId[i] == id) {
                return i;
            }
        }
        return -1;
    }
    /* Calculates wage (gross pay) using hours and payrate */
    public void set_gross_pay(int id_number) {
        int index = find_index(id_number);
        this.wages[index] = this.hours[index] * this.payRate[index];
    }

    /* Get employee's total wage (gross pay) by ID. 
    Accepts an employee’s identification number as an argument and returns the
    gross pay for that employee
    */
    public double get_gross_pay(int id_number) {
        int index = find_index(id_number);
        return this.wages[index];
    }

    public void set_hours(int id_number, int hours) {
        int index = find_index(id_number);
        this.hours[index] = hours;
    }

    public int get_hours(int id_number) {
        int index = find_index(id_number);
        return this.hours[index];
    }

    public void set_payrate(int id_number, double payRate) {
        int index = find_index(id_number);
        this.payRate[index] = payRate;
    }

    public double get_payrate(int id_number) {
        int index = find_index(id_number);
        return this.payRate[index];
    }

    public void display_all() {
        System.out.println("ALL EMPLOYEES");
        System.out.println("*************");
        for (int id: this.employeeId) {
            System.out.printf("ID: %d  HOURS: %d  PAYRATE: $%.2f/hour  GROSS PAY: " + 
            "$%.2f\n", id, get_hours(id), get_payrate(id), get_gross_pay(id) );
        }
    }

    
}