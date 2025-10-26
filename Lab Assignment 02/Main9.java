class Rectangle 
{
    private double length;
    private double width;

    public void setLength(double length)
    {
        this.length = length;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    public double getLength()
    {
        return length;
    }
    public double getWidth() 
    {
        return width;
    }
    public double calculateArea()
    {
        return length * width;
    }
    public double calculatePerimeter() 
    {
        return 2 * (length + width);
    }
}
public class Main9
{
    public static void main(String[] args)
    {
        Rectangle rect = new Rectangle();

        rect.setLength(10.5);
        rect.setWidth(5.2);

        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());

        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
    }
}