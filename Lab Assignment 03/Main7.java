interface Flyable
{
    void fly_obj();
}
class Spacecraft implements Flyable 
{
    @Override
    public void fly_obj() 
    {
        System.out.println("\nThe spacecraft flies in outer space at very high speed!");
    }
}
class Airplane implements Flyable
{
    @Override
    public void fly_obj() 
    {
        System.out.println("\nThe airplane flies in the sky"
                + " carrying passengers and cargo.");
    }
}
class Helicopter implements Flyable 
{
    @Override
    public void fly_obj() {
        System.out.println("\nThe helicopter hovers "
                + "and flies vertically using rotating blades.");
    }
}
public class Main7
{
    public static void main(String[] args)
    {
        Flyable spacecraft = new Spacecraft();
        Flyable airplane = new Airplane();
        Flyable helicopter = new Helicopter();

        System.out.println("=== Demonstration of Flyable Interface ===");
        spacecraft.fly_obj();
        airplane.fly_obj();
        helicopter.fly_obj();
    }
}