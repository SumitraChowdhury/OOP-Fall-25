public class Car 
{
    String make;
    String model;
    int year;
//Constructor with Default Values
    Car(String make, String model, int year)
    {
        this.make = (make != null && !make.isEmpty()) ? make : "Unknown Make";
        this.model = (model != null && !model.isEmpty()) ? model : "Unknown Model";
        this.year = (year > 0) ? year : 2000;  
    }
    void displayInfo() 
    {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Car car1 = new Car("Toyota", "Corolla", 2022);
        System.out.println("Car 1 Details:");
        car1.displayInfo();

        Car car2 = new Car("", "Civic", 0);
        System.out.println("Car 2 Details:");
        car2.displayInfo();

        Car car3 = new Car(null, null, 0);
        System.out.println("Car 3 Details:");
        car3.displayInfo();
    }
}