class House 
{
    private String address;
    private int numberOfRooms;
    private double area; 
    
    public House(String address, int numberOfRooms, double area)
    {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.area = area;
    }
    public String getAddress() 
    { 
        return address; 
    }
    public void setAddress(String address)
    { 
        this.address = address;
    }
    public int getNumberOfRooms() 
    { 
        return numberOfRooms;
    }
    public void setNumberOfRooms(int numberOfRooms)
    { 
        this.numberOfRooms = numberOfRooms;
    }
    public double getArea() 
    {
        return area; 
    }
    public void setArea(double area)
    { 
        this.area = area;
    }
    public double calculatePrice(double pricePerSqMeter) 
    {
        return area * pricePerSqMeter;
    }
}
public class Main7
{
    public static void main(String[] args)
    {
        House house = new House("123 Maple Street", 4, 150.5);

        System.out.println
        (
            "Address: " + house.getAddress() +
            "\nNumber of Rooms: " + house.getNumberOfRooms() +
            "\nArea: " + house.getArea() + " sq.m"
        );
        
        double price = house.calculatePrice(1200);
        System.out.println("Price of the house: $" + price);
    }
}