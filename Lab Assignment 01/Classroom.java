public class Classroom 
{
    String className;
    String[] students;
//Constructor with Array Initialization
    Classroom(String className, String[] students)
    {
        this.className = className;
        this.students = students;
    }
    void displayInfo()
    {
        System.out.println("Class Name: " + className);
        System.out.println("Students:");
        for (String student : students) 
        {
            System.out.println("- " + student);
        }
    }
    public static void main(String[] args) 
    {
        String[] studentList = {"Noman", "Sifat", "Rifat", "Kawsar"};

        Classroom myClass = new Classroom("CSE-65C", studentList);

        myClass.displayInfo();
    }
}