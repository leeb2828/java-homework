public class Temperature {
    double ftemp;

    public Temperature(double temp) {
        ftemp = temp;
    }

    public void setFahrenheit(double temp) {
        ftemp = temp;
    }

    public double getFahrenheit() {
        return this.ftemp;
    }

    public double getCelsius() {
        double celsius = ( (5.0/9.0) * (ftemp - 32) );
        return celsius;
    }

    public double getKelvin() {
        double kelvin = ( ((5.0/9) * (ftemp - 32) + 273) );
        return kelvin;
    }

    // display all the information
    public void displayAll() {
        double celsius = 5.0/9 * (ftemp - 32);
        double kelvin = ( ((5.0/9) * (ftemp - 32) + 273) );
        System.out.printf("Fahrenheit: %.1f  Celsius: %.1f  Kelvin: %.1f\n", ftemp, celsius, kelvin);
    }
}
