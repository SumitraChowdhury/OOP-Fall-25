abstract class Animal 
{
    abstract void eat();
    abstract void sleep();
}
class Lion extends Animal 
{
    @Override
    void eat() 
    {
        System.out.println("Lion eats meat.");
    }
    @Override
    void sleep()
    {
        System.out.println("Lion sleeps in the den.");
    }
}
class Tiger extends Animal
{
    @Override
    void eat()
    {
        System.out.println("Tiger eats meat.");
    }

    @Override
    void sleep()
    {
        System.out.println("Tiger sleeps under trees.");
    }
}
class Deer extends Animal
{
    @Override
    void eat() 
    {
        System.out.println("Deer eats grass and leaves.");
    }

    @Override
    void sleep()
    {
        System.out.println("Deer sleeps in the forest.");
    }
}
public class Main3
{
    public static void main(String[] args)
    {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        Animal deer = new Deer();

        lion.eat();
        lion.sleep();

        System.out.println();

        tiger.eat();
        tiger.sleep();

        System.out.println();

        deer.eat();
        deer.sleep();
    }
}