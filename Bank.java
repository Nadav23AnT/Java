public class Bank
{
    private String accountNumber;
    private double _balance;
    private double _framework;
    private String _accountNumber;

    public Bank (String accountNumber, double balance, double framework)
    {
        _accountNumber = accountNumber; 
        _balance = balance; 
        _framework = framework; 
    }

    public Bank (String accountNumber)
    {
        _accountNumber = accountNumber; 
        _balance = 0; 
        _framework = 0; 
    }

    public Bank (Bank other)
    {
        this(other._accountNumber, other._balance, other._framework);
    }

    public void deposit (double amountOfMoney) {
        _balance += amountOfMoney;
    }
    public String getAccountNumber()
    {
        return _accountNumber; 
    }

    public double getBalance()
    {
        return _balance; 
    }

    public double getFramework()
    {
        return _framework; 
    }
}