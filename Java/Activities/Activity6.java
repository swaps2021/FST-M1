package activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

class Plane{
    private List<String> passengerName;
    private int maxPassengers;
    private Date takeOffTime;
    private Date landingTime;

    public Plane (int maxPassengers){
        this.maxPassengers=maxPassengers;
        this.passengerName = new ArrayList<>();
    }
    public void onboard ( String pName){
        this.passengerName.add(pName);
    }
    public Date takeOff (){
        this.takeOffTime =new Date();
        return takeOffTime;
    }

    public void land(){
        this.landingTime = new Date();
        this.passengerName.clear();
    }

    public Date getLandingTime(){
        return landingTime;
    }

    public List<String> getPassengerName(){
        return passengerName;
    }

}

public class Activity6 {

    public static void main(String[] args) throws InterruptedException
    {
    Plane plane = new Plane(10);
    plane.onboard("Mark");
    plane.onboard("Annie");
    plane.onboard("Gail");
    plane.onboard("Steve");
    plane.onboard("Serena");
    System.out.println("Plane took off at : "+plane.takeOff());
    System.out.println("Passengers onboard are : "+plane.getPassengerName());
    Thread.sleep(5000);
    plane.land();
    System.out.println("Plane landed at : "+plane.getLandingTime());
    System.out.println("Passengers landed from plane are : "+plane.getPassengerName());
    }
}
