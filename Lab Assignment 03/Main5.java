abstract class BankAccount
{
    protected double balance;

    public BankAccount(double balance) 
    {
        this.balance = balance;
    }
    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    public void displayBalance() 
    {
        System.out.println("Current Balance: $" + balance);
    }
}
class SavingsAccount extends BankAccount
{
    public SavingsAccount(double balance) 
    {
        super(balance);
    }
    @Override
    void deposit(double amount)
    {
        balance += amount;
        System.out.println("Deposited $" + amount + " to Savings Account");
    }
    @Override
    void withdraw(double amount)
    {
        if (amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from Savings Account");
        }
        else 
        {
            System.out.println("Insufficient balance in Savings Account");
        }
    }
}
class CurrentAccount extends BankAccount 
{
    public CurrentAccount(double balance) 
    {
        super(balance);
    }
    @Override
    void deposit(double amount)
    {
        balance += amount;
        System.out.println("Deposited $" + amount + " to Current Account");
    }
    @Override
    void withdraw(double amount)
    {
        balance -= amount; 
        System.out.println("Withdrawn $" + amount + " from Current Account");
    }
}
public class Main5
{
    public static void main(String[] args)
    {
        BankAccount savings = new SavingsAccount(1000);
        BankAccount current = new CurrentAccount(500);

        savings.deposit(500);
        savings.withdraw(200);
        savings.displayBalance();

        System.out.println();

        current.deposit(300);
        current.withdraw(1000); 
        current.displayBalance();
    }
}