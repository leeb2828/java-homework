public class Main {
    public static void main(String[] args) {
        System.out.println(is_power(10, 2)); // False
        System.out.println(is_power(27, 3)); // true because 3^3 = 27. 27 is a power of 3.
        System.out.println(is_power(1, 1)); // true
        System.out.println(is_power(10, 1)); // false
        System.out.println(is_power(3, 3)); // true
        System.out.println(is_power(625, 5)); // true
    }

    /*
    Takes in two numbers of type double and determines if
    the first number can be divided evenly into the second number. 
    */
    public static Boolean is_divisible(double val, double base) {
        if (val % base == 0) {
            return true; 
        } else {
            return false;
        }
    }

    /* 
    This function takes in a value number and base number. Determines if
    the "value" is a power of the "base" by dividing value into base until 'base case'.
    Returns: True or False.
    */
    public static Boolean is_power(double value, double base) {
        //System.out.println("value : " + value + " " + "base: " + base);
        if (value == base) {
            // For example, 3^1 = 3. Therefore, 3 is a power of 3.
            return true;
        }
        else if (base == 1) {
            // the only positive integer that is a power of "1" is 1 itself.
            return false;
        }
        else {
            // remember that both of these conditions must be true, so if
            // is_divisible() returns false, program stops running.
            return is_divisible(value, base) && is_power((value / base), base);
        }
    }

}