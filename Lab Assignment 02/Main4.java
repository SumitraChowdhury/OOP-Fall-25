class Circle 
{
    private double radius;

    public void setRadius(double r)
    {
        radius = r;
    }
    public double getRadius() 
    {
        return radius;
    }
    public double calculateArea()
    {
        return Math.PI * radius * radius;
    }
    public double calculatePerimeter()
    {
        return 2 * Math.PI * radius;
    }
}
public class Main4
{
    public static void main(String[] args)
    {
        Circle c = new Circle();

        c.setRadius(7.5);

        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.calculateArea());
        System.out.println("Perimeter: " + c.calculatePerimeter());
    }
}