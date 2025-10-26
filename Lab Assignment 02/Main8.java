class Person 
{
    private String name;
    private int age;
    private String country;

    public void setName(String name) 
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setCountry(String country) 
    {
        this.country = country;
    }
    public String getName()
    {
        return name;
    }
    public int getAge() 
    {
        return age;
    }
    public String getCountry() 
    {
        return country;
    }
}
public class Main8 
{
    public static void main(String[] args)
    {
        Person person = new Person();
        person.setName("Sifat");
        person.setAge(19);
        person.setCountry("Bangladesh");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Country: " + person.getCountry());
    }
}