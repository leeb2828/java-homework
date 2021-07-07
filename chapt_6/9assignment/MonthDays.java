public class MonthDays {
    int month;
    int year;

    public MonthDays(int month, int year) {
        this.month = month;
        this.year = year;
    }
    
    public Boolean isLeapYear(int year) {
        Boolean isLeapYear;
        if (year % 100 == 0 && year % 400 == 0) {
            isLeapYear = true;
        }
        else if (year % 100 != 0 && year % 4 == 0) {
            isLeapYear = true;
        }
        else {
            isLeapYear = false;
        }
        return isLeapYear;
    }

    /* Returns the number of days in the specified month. */
    public int getNumberOfDays(int the_month) {
        Boolean leapYear = isLeapYear(this.year);
        int num_of_days;
        // If February
        if (the_month == 2) {
            if (leapYear) {
                num_of_days = 29;
            }
            else {
                num_of_days = 28;
            }
        }
        // If April, June, September, or November
        else if (the_month == 4 || the_month == 6 || month == 9 || month == 11) {
            num_of_days = 30;
        }

        // If any other month
        else {
            num_of_days = 31;
        }

        return num_of_days;
    }
}