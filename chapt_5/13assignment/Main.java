/* 
A prime number is a number that is evenly divisible only by itself and 1. For example, the
number 5 is prime because it can be evenly divided only by 1 and 5. The number 6, however,
is not prime because it can be divided evenly by 1, 2, 3, and 6.

Write a method named isPrime , which takes an integer as an argument and returns true if
the argument is a prime number, or false otherwise. Demonstrate the method in a complete
program.
*/

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 29, 6, 10, 12};
        for (int i = 0; i < numbers.length; i++) {
            boolean answer = isPrime(numbers[i]);
            System.out.printf("Is %d a prime number? Answer: %b \n", numbers[i], answer);
        }
    }

    static boolean isPrime(int num) {
        // if a number is equal to 2, it is prime
        if (num == 2) {
            return true;
        }
        /* prime number is always greater than 1.
           prime number is divisible ONLY by 1 and itself. */
        else if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

        else {
            return false;
        }
    }
}