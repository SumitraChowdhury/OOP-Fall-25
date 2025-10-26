class Vehicle 
{
    String make;
    String model;
    int year;
    String fuelType;
//Vehicle Performance Calculator in Java
    Vehicle(String make, String model, int year, String fuelType) 
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }
    void calculateFuelEfficiency() 
    {
        System.out.println("Fuel efficiency not specified.");
    }
    void calculateDistance(double fuelUsed) 
    {
        System.out.println("Distance traveled: " + (fuelUsed * 0) + " km");
    }
    void getMaxSpeed()
    {
        System.out.println("Max speed not specified.");
    }

    void displayInfo() 
    {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
    }
}
class Truck extends Vehicle 
{
    double fuelEfficiency; 
    double maxSpeed; 

    Truck(String make, String model, int year, String fuelType, double fuelEfficiency, double maxSpeed)
    {
        super(make, model, year, fuelType);
        this.fuelEfficiency = fuelEfficiency;
        this.maxSpeed = maxSpeed;
    }
    @Override
    void calculateFuelEfficiency() 
    {
        System.out.println("Fuel Efficiency: " + fuelEfficiency + " km/l");
    }
    @Override
    void calculateDistance(double fuelUsed) 
    {
        System.out.println("Distance traveled: " + (fuelUsed * fuelEfficiency) + " km");
    }
    @Override
    void getMaxSpeed() 
    {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
class Car extends Vehicle 
{
    double fuelEfficiency;
    double maxSpeed;

    Car(String make, String model, int year, String fuelType, double fuelEfficiency, double maxSpeed)
    {
        super(make, model, year, fuelType);
        this.fuelEfficiency = fuelEfficiency;
        this.maxSpeed = maxSpeed;
    }
    @Override
    void calculateFuelEfficiency() 
    {
        System.out.println("Fuel Efficiency: " + fuelEfficiency + " km/l");
    }
    @Override
    void calculateDistance(double fuelUsed) 
    {
        System.out.println("Distance traveled: " + (fuelUsed * fuelEfficiency) + " km");
    }
    @Override
    void getMaxSpeed() 
    {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
class Motorcycle extends Vehicle
{
    double fuelEfficiency;
    double maxSpeed;

    Motorcycle(String make, String model, int year, String fuelType, double fuelEfficiency, double maxSpeed)
    {
        super(make, model, year, fuelType);
        this.fuelEfficiency = fuelEfficiency;
        this.maxSpeed = maxSpeed;
    }
    @Override
    void calculateFuelEfficiency() 
    {
        System.out.println("Fuel Efficiency: " + fuelEfficiency + " km/l");
    }
    @Override
    void calculateDistance(double fuelUsed)
    {
        System.out.println("Distance traveled: " + (fuelUsed * fuelEfficiency) + " km");
    }
    @Override
    void getMaxSpeed() 
    {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
public class Main4 
{
    public static void main(String[] args)
    {
        Truck truck = new Truck("Volvo", "FH16", 2020, "Diesel", 4.5, 120);
        truck.displayInfo();
        truck.calculateFuelEfficiency();
        truck.getMaxSpeed();
        truck.calculateDistance(50);
        System.out.println();

        Car car = new Car("Toyota", "Corolla", 2022, "Petrol", 15.0, 180);
        car.displayInfo();
        car.calculateFuelEfficiency();
        car.getMaxSpeed();
        car.calculateDistance(40);
        System.out.println();

        Motorcycle bike = new Motorcycle("Yamaha", "MT-15", 2023, "Petrol", 35.0, 140);
        bike.displayInfo();
        bike.calculateFuelEfficiency();
        bike.getMaxSpeed();
        bike.calculateDistance(10);
    }
}