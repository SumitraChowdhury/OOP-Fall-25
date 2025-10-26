public class Student 
{
    int studentId;
    String studentName;
    char grade;
//Chaining Constructors
    Student() 
    {
        
    }
    Student(int studentId, String studentName, char grade)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }
    void displayInfo() 
    {
        System.out.println("Student ID: " + studentId+ "\nStudent Name: " + studentName+"\nGrade: " + grade);
        System.out.println();
    }
    public static void main(String[] args)
    {
        Student s1 = new Student();
        System.out.println("Using Default Constructor:");
        s1.displayInfo();

        Student s2 = new Student(101, "Sifat", 'A');
        System.out.println("Using Parameterized Constructor:");
        s2.displayInfo();
    }
}