
public class Account{

    private double Balance;
    private int AccountNumber;

    public Account(int accountNumber,double balance) {
        AccountNumber = accountNumber;
        Balance = balance;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public void withdraw(double amount)
    {
        if(getBalance()<amount)
            System.out.println("you Can not Withdraw ");
        else
            setBalance(getBalance()- amount);

    }
    public void deposit(double amount)
    {
        //Balance += amount;
        setBalance(getBalance()+ amount);
    }

/*    public String toString()
    {
        String AccountInfo="";
        double balance = getBalance();
        AccountInfo= String.format("%s%s", getAccountNumber(), balance);
        return AccountInfo;
    }*/
    @Override
    public String toString() {
        return "Account{" +
                "Balance=" + Balance +
                ", AccountNumber='" + AccountNumber + '\'' +
                '}';
    }
}
