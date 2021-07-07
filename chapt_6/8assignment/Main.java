import java.util.Scanner; 
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        /* This is for formatting fahrenheit, celsius, and kelvin temperatures */
        DecimalFormat df = new DecimalFormat("##.#");
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a temperature in fahrenheit: ");
        double user_input = scan.nextDouble();

        System.out.println();
        
        Temperature user_temp = new Temperature(user_input);
        double fah = user_temp.getFahrenheit();
        double cel = user_temp.getCelsius();
        double kel = user_temp.getKelvin();

        System.out.printf("Fahrenheit: %s  Celsius: %s " + 
        "Kelvin: %s\n", (df.format(fah)), (df.format(cel)), df.format(kel));
        
        
        
    }
    
}
