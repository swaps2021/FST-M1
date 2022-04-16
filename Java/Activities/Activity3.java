package activities;

public class Activity3 {
    public static void main(String[] args){
        double seconds = 1000000000;
        double earthSecs = 31557600;
        double mercurySecs = 0.2408467;
        double venusSecs = 0.61519726;
        double marsSecs = 1.8808158;
        double jupiterSecs = 11.862615;
        double saturnSecs = 29.447498;
        double uranusSecs = 84.016846;
        double neptuneSecs = 164.79132;

        System.out.println("Mercury Age : " + seconds / earthSecs / mercurySecs);
        System.out.println("Venus Age: " + seconds / earthSecs / venusSecs);
        System.out.println("Earth Age: " + seconds / earthSecs);
        System.out.println("Mars Age: " + seconds / earthSecs / marsSecs);
        System.out.println("Jupiter Age: " + seconds / earthSecs / jupiterSecs);
        System.out.println("Saturn Age: " + seconds / earthSecs / saturnSecs);
        System.out.println("Uranus Age: " + seconds / earthSecs / uranusSecs);
        System.out.println("Neptune Age: " + seconds / earthSecs / neptuneSecs);

    }
}
