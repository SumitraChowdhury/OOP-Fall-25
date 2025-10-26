class Employee 
{
    String name;
    String address;
    double salary;
    String jobTitle;
//Employee Performance and Bonus Calculator
    Employee(String name, String address, double salary, String jobTitle) 
    {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }
    void calculateBonus() 
    {
        System.out.println(name + "'s bonus calculation not defined for general employee.");
    }
    void generatePerformanceReport()
    {
        System.out.println(name + "'s performance report not defined for general employee.");
    }
    void manageProjects() 
    {
        System.out.println(name + " has no project management responsibilities by default.");
    }
    void displayInfo() 
    {
        System.out.println("Name: " + name+"\nAddress: " + address+"\nSalary: $" + salary+"\nJob Title: " + jobTitle);
        System.out.println();
    }
}
class Manager extends Employee 
{
    int teamSize;

    Manager(String name, String address, double salary, String jobTitle, int teamSize) 
    {
        super(name, address, salary, jobTitle);
        this.teamSize = teamSize;
    }
    @Override
    void calculateBonus()
    {
        double bonus = salary * 0.2; // 20% bonus
        System.out.println(name + "'s Bonus: $" + bonus);
    }
    @Override
    void generatePerformanceReport() 
    {
        System.out.println(name + " (Manager) Performance Report: Leading a team of " + teamSize + " members effectively.");
    }
    @Override
    void manageProjects() 
    {
        System.out.println(name + " is managing multiple projects for the team.");
    }
}
class Developer extends Employee 
{
    String programmingLanguage;

    Developer(String name, String address, double salary, String jobTitle, String programmingLanguage)
    {
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    void calculateBonus() 
    {
        double bonus = salary * 0.15; 
        System.out.println(name + "'s Bonus: $" + bonus);
    }
    @Override
    void generatePerformanceReport()
    {
        System.out.println(name + " (Developer) Performance Report: Completed projects using " + programmingLanguage + ".");
    }
    @Override
    void manageProjects()
    {
        System.out.println(name + " is contributing code to ongoing projects.");
    }
}
class Programmer extends Employee
{
    int projectsHandled;

    Programmer(String name, String address, double salary, String jobTitle, int projectsHandled)
    {
        super(name, address, salary, jobTitle);
        this.projectsHandled = projectsHandled;
    }
    @Override
    void calculateBonus() 
    {
        double bonus = salary * 0.1;
        System.out.println(name + "'s Bonus: $" + bonus);
    }
    @Override
    void generatePerformanceReport()
    {
        System.out.println(name + " (Programmer) Performance Report: Successfully handled " + projectsHandled + " projects.");
    }

    @Override
    void manageProjects()
    {
        System.out.println(name + " is handling assigned projects efficiently.");
    }
}
public class Main5 
{
    public static void main(String[] args)
    {
        Manager manager = new Manager("Alice Johnson", "123 Street, NY", 120000, "Project Manager", 5);
        manager.displayInfo();
        manager.calculateBonus();
        manager.generatePerformanceReport();
        manager.manageProjects();
        System.out.println();

        Developer developer = new Developer("Bob Smith", "456 Avenue, CA", 90000, "Software Developer", "Java");
        developer.displayInfo();
        developer.calculateBonus();
        developer.generatePerformanceReport();
        developer.manageProjects();
        System.out.println();

        Programmer programmer = new Programmer("Charlie Brown", "789 Road, TX", 70000, "Programmer", 3);
        programmer.displayInfo();
        programmer.calculateBonus();
        programmer.generatePerformanceReport();
        programmer.manageProjects();
    }
}