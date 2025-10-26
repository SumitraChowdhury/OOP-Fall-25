class Smartphone
{
    private String brand;
    private String model;
    private int storageCapacity;

    public Smartphone(String brand, String model, int storageCapacity)
    {
        this.brand = brand;
        this.model = model;
        this.storageCapacity = storageCapacity;
    }
    public String getBrand()
    { 
        return brand;
    }
    public void setBrand(String brand) 
    { 
        this.brand = brand; 
    }
    public String getModel()
    { 
        return model; 
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public int getStorageCapacity()
    {
        return storageCapacity;
    }
    public void setStorageCapacity(int storageCapacity) 
    { 
        this.storageCapacity = storageCapacity; 
    }
    public void increaseStorage(int extraStorage)
    {
        storageCapacity += extraStorage;
        System.out.println("Storage increased by " + extraStorage + "GB.");
        System.out.println("New Storage Capacity: " + storageCapacity + "GB");
    }
}
public class Main10 
{
    public static void main(String[] args) 
    {
        Smartphone phone = new Smartphone("Samsung", "Galaxy S24", 128);

        System.out.println
        (
            "Brand: " + phone.getBrand() +
            "\nModel: " + phone.getModel() +
            "\nStorage Capacity: " + phone.getStorageCapacity() + "GB"
        );

        phone.increaseStorage(64); 
    }
}