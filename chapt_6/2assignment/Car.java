public class Car {
    int yearModel;
    String make;
    int speed;

    public Car(int yearModel, String make) {
        speed = 0;
        this.yearModel = yearModel;
        this.make = make;
    }

    public int getYearModel() {
        return this.yearModel;
    }

    public String getMake() {
        return this.make;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void accelerate() {
        speed = speed + 5;
    }

    public void brake() {
        speed = speed - 5;
    }
}