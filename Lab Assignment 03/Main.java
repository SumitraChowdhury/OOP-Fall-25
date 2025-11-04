abstract class Vehicle 
{
    abstract void startEngine();
    abstract void stopEngine();
}
class Car extends Vehicle 
{
    void startEngine() 
    {
        System.out.println("Car engine started with a key!");
    }

    void stopEngine() 
    {
        System.out.println("Car engine stopped.");
    }
}
class Motorcycle extends Vehicle 
{
    void startEngine() 
    {
        System.out.println("Motorcycle engine started with a button!");
    }
    void stopEngine() 
    {
        System.out.println("Motorcycle engine stopped.");
    }
}
public class Main 
{
    public static void main(String[] args) 
    {
        Car car = new Car();
        Motorcycle bike = new Motorcycle();

        System.out.println("--- Car ---");
        car.startEngine();
        car.stopEngine();

        System.out.println("\n--- Motorcycle ---");
        bike.startEngine();
        bike.stopEngine();
    }
}