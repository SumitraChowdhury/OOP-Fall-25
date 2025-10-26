class Vehicle 
{
    void drive() 
    {
        System.out.println("Driving a vehicle");
    }
}//Method Overriding in Inheritance (Vehicle–Car Example)
class Car extends Vehicle 
{
    @Override
    void drive() 
    {
        System.out.println("Repairing a car");
    }
}
public class Main 
{
    public static void main(String[] args)
    {
        Vehicle v1 = new Vehicle();
        v1.drive();

        Car c1 = new Car();
        c1.drive();

        Vehicle v2 = new Car();
        v2.drive();
    }
}