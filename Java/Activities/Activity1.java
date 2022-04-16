package activities;

public class Activity1 {
    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.make = 2018;
        toyota.color = "White";
        toyota.transmission = "Automatic";

        toyota.displayCharacteristics();
        toyota.accelerate();
        toyota.brake();
    }
}
