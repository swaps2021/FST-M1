package activities;

public class Car {
String color;
int make;
String transmission;
int tyres;
int doors;

//Constructor
    Car()
    {
        tyres = 4;
        doors = 4;
    }

    //Method
    public void displayCharacteristics(){
        System.out.println("Colour of the Car = "+color);
        System.out.println("Transmission of the Car: " + transmission);
        System.out.println("Number of doors on the car: " + doors);
        System.out.println("Number of tyres on the car: " + tyres);
           }

           public void accelerate(){
               System.out.println("Car is moving forward.");
           }

           public void brake(){
               System.out.println("Car has stopped.");
           }
}
