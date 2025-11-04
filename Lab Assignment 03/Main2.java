abstract class Animal 
{
    abstract void sound();
}
class Lion extends Animal 
{
    @Override
    void sound() 
    {
        System.out.println("Lion says: Roar!");
    }
}
class Tiger extends Animal 
{
    @Override
    void sound()
    {
        System.out.println("Tiger says: Growl!");
    }
}
public class Main2
{
    public static void main(String[] args) 
    {
        Animal lion = new Lion();
        Animal tiger = new Tiger();

        lion.sound();   
        tiger.sound();  
    }
}