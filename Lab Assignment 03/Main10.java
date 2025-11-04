abstract class Shape 
{
    abstract double calculateArea();
    abstract double calculatePerimeter();
}
class Circle extends Shape 
{
    private double radius;

    public Circle(double radius) 
    {
        this.radius = radius;
    }
    @Override
    double calculateArea() 
    {
        return 3.14 * radius * radius; 
    }
    @Override
    double calculatePerimeter() 
    {
        return 2 * 3.14 * radius;
    }
}
class Triangle extends Shape
{
    private double base, height, side1, side2, side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    double calculateArea()
    {
        return 0.5 * base * height; 
    }
    @Override
    double calculatePerimeter() 
    {
        return side1 + side2 + side3; 
    }
}
public class Main10 
{
    public static void main(String[] args)
    {
        Shape circle = new Circle(7);            
        Shape triangle = new Triangle(4, 3, 4, 3, 5); 

        System.out.println
        (
            "Circle Area: " + circle.calculateArea() +
            "\nCircle Perimeter: " + circle.calculatePerimeter()
        );
        System.out.println
        (
            "\nTriangle Area: " + triangle.calculateArea() +
            "\nTriangle Perimeter: " + triangle.calculatePerimeter()
        );
    }
}