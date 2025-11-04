interface Resizable 
{
    void resizeWidth(int width);
    void resizeHeight(int height);
}
class Rectangle implements Resizable 
{
    private int width;
    private int height;

    public Rectangle(int width, int height) 
    {
        this.width = width;
        this.height = height;
    }
    public void resizeWidth(int width) 
    {
        this.width = width;
        System.out.println("Width resized to: " + width);
    }
    public void resizeHeight(int height) 
    {
        this.height = height;
        System.out.println("Height resized to: " + height);
    }
    public void display()
    {
        System.out.println("Rectangle Width: " + width + ", Height: " + height);
    }
}
public class Main8 
{
    public static void main(String[] args) 
    {
        Rectangle rect = new Rectangle(10, 5);
        System.out.println("Before Resizing:");
        rect.display();

        rect.resizeWidth(15);
        rect.resizeHeight(8);

        System.out.println("\nAfter Resizing:");
        rect.display();
    }
}