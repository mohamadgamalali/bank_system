public class SpecialAccount extends Account {
    public SpecialAccount(int accountNumber,double balance) {
        super(accountNumber,balance);
    }

    public void withdraw(double amount)
    {
        if(super.getBalance()<= amount)
        {
            if((super.getBalance()-amount) >= -1000)
            {
                super.setBalance(super.getBalance()- amount);
            }
            else if((super.getBalance()-amount) < -1000)
            {
                System.out.println("you Can not withdraw more than 1000");
            }
        }
        else
        {
            super.setBalance(super.getBalance()- amount);
        }

    }
}
