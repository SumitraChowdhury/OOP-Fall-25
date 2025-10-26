public class Dog 
{
    String name;
    String color;
//Parameterized Constructor
    Dog(String name, String color) 
    {
        this.name = name;
        this.color = color;
    }
    void displayInfo() 
    {
        System.out.println("Dog's Name: " + name);
        System.out.println("Dog's Color: " + color);
    }
    public static void main(String[] args)
    {
        Dog myDog = new Dog("Buddy", "Brown");

        myDog.displayInfo();
    }
}