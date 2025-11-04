interface Drawable 
{
    void draw();  
}
class Circle implements Drawable 
{
    public void draw() 
    {
        System.out.println("Drawing a Circle");
    }
}
class Rectangle implements Drawable 
{
    public void draw() 
    {
        System.out.println("Drawing a Rectangle");
    }
}
class Triangle implements Drawable 
{
    public void draw() 
    {
        System.out.println("Drawing a Triangle");
    }
}
public class Main6 
{
    public static void main(String[] args) 
    {
        Drawable c = new Circle();
        Drawable r = new Rectangle();
        Drawable t = new Triangle();

        System.out.println("--- Drawing Shapes ---");
        c.draw();
        r.draw();
        t.draw();
    }
}