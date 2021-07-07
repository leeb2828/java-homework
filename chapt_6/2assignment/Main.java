public class Main {
    public static void main(String[] args) {
        Car highlander = new Car(2012, "Toyota");
        /* Accelerate 5 times */
        highlander.accelerate();
        System.out.println("Current Speed: " + highlander.getSpeed());

        highlander.accelerate();
        System.out.println("Current Speed: " + highlander.getSpeed());

        highlander.accelerate();
        System.out.println("Current Speed: " + highlander.getSpeed());

        highlander.accelerate();
        System.out.println("Current Speed: " + highlander.getSpeed());

        highlander.accelerate();
        System.out.println("Current Speed: " + highlander.getSpeed());

        System.out.println();
        
        /* Brake 5 times */
        highlander.brake();
        System.out.println("Current Speed: " + highlander.getSpeed());

        highlander.brake();
        System.out.println("Current Speed: " + highlander.getSpeed());

        highlander.brake();
        System.out.println("Current Speed: " + highlander.getSpeed());

        highlander.brake();
        System.out.println("Current Speed: " + highlander.getSpeed());

        highlander.brake();
        System.out.println("Current Speed: " + highlander.getSpeed());


    }
}