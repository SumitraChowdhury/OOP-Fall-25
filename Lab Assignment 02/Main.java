class BankAccount 
{
    private String accountNumber;
    private double balance;

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public String getAccountNumber()
    {
        return accountNumber;
    }
    public double getBalance()
    {
        return balance;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount();

        account.setAccountNumber("ACC12345");
        account.setBalance(5000.75);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: $" + account.getBalance());
    }
}