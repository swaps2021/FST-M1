package activities;

interface BicycleParts {
    public int gears = 0;
    public int currentSpeed = 0;
}
interface BicycleOperations{
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}
class Bicycle implements BicycleParts,BicycleOperations{
    public int gears;
    public int currentSpeed;
    public Bicycle(int gears,int currentSpeed){
        this.gears=gears;
        this.currentSpeed=currentSpeed;
    }
    public void applyBrake(int decrement){
        currentSpeed -=decrement;
        System.out.println("Current Speed = "+currentSpeed);
    }
    public void speedUp(int increment){
        currentSpeed += increment;
        System.out.println("Current Speed = "+currentSpeed);
    }
    public String bicycleDesc(){
        return("No of gears are "+gears+"\n Speed of bicycle is "+currentSpeed );
    }
}
class mountainBike extends Bicycle{
    public int seatHeight;
    public mountainBike (int gears,int currentSpeed,int startHeight){
        super(gears,currentSpeed);
        seatHeight=startHeight;
    }
public void setHeight (int newValue){
        seatHeight = newValue;
}
public String bicycleDesc(){
        return (super.bicycleDesc()+ "\n Seat Height is" +seatHeight);
}
}
public class Activity7 {
    public static void main(String[] args){
        mountainBike mb = new mountainBike(3,0,25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
    }
}
