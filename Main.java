
import java.util.*;
public class Main {

    /**
     *
     * The program implements an application that
     * show bank system
     * @param args
     * @author Samir , Yassin ,Gemy , Osama
     * @version 1.3
     * @since   2021-04-25
     *
     */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int choice;
        String name, adress,NID,CID;
        int phone;
        double balance;
        int accountNumber=100;
        ArrayList<Account> accounts;

        Bank bank=new Bank("Bank1","address1",20210);
        System.out.println("Welcom To "+bank.getName());
        while (true)
        {
            //accounts=bank.getAccounts();
            System.out.println(" 1- Admin \n 2- User" );
            choice= input.nextInt();
            if(choice==1)
            {
                System.out.println("1-display Accounts & Clients \n2- Add Account \n3- Exit");
                choice=input.nextInt();
                if(choice==1)
                {
                    bank.display();
                }
                else if (choice==2)
                {
                    System.out.println("Enter Name : ");
                    name=input.next();
                    System.out.println("Address : ");
                    adress=input.next();
                    System.out.println("Phone : ");
                    phone=input.nextInt();
                    System.out.println("CommercialClient ? or not ? (yes 1 or no 0) ");
                    int  clientType= input.nextInt();
                    if (clientType==1)
                    {
                        NID="0000000000000000";
                        System.out.println("Enter CID : ");
                        CID=input.next();
                        System.out.println("Balance : ");
                        balance=input.nextDouble();
                        Account account=new Account(++accountNumber,balance);
                        //account.setAccountNumber(++accountNumber);
                        System.out.println("your Account number is :" + account.getAccountNumber());
                        bank.addCommercialClient(name,adress,phone,NID,CID,balance,accountNumber);
                    }
                    else if(clientType==0)
                    {
                        int accType;
                        System.out.println("NID : ");
                        NID= input.next();
                        System.out.println("Balance : ");
                        balance=input.nextDouble();
                        System.out.println("Special Account? (yes 1 or no 0) ");
                        accType=input.nextInt();
                        if(accType==1)
                        {
                            Account account=new SpecialAccount(++accountNumber,balance);
                            //account.setAccountNumber(++accountNumber);
                            System.out.println("your Account number is :" + account.getAccountNumber());
                            bank.addSpecialClient(name,adress,phone,NID,balance,accountNumber);
                        }
                        else if(accType==0)
                        {
                            Account account=new Account(++accountNumber,balance);
                            //account.setAccountNumber(++accountNumber);
                            System.out.println("your Account number is :" + account.getAccountNumber());
                            bank.addClient(name,adress,phone,NID,balance,accountNumber);
                        }
                    }
                }
                else if(choice==3)
                {
                    break;
                }

            }
            else if(choice==2) //user
            {
                System.out.println("Enter Account Number : ");
                int account_Number= input.nextInt();
                accounts=bank.getAccounts();
                //ArrayList<Integer> accountNumbers=new ArrayList<>();
                double amount;
                //Account account=new Account(account_Number,accounts.getBalance())
                for (int i=0;i<accounts.size();i++)
                {
                    if(account_Number==accounts.get(i).getAccountNumber())
                    {
                        int accountType;
                        System.out.println(" you have Access now...  \n 1- Withdraw \n 2- Deposit \n 3-exit");
                        choice=input.nextInt();
                        //Account account=new Account(account_Number,accounts.get(i).getBalance());
                        if (choice==1)
                        {
                          //****
                            System.out.println("Enter Amount :");
                            amount=input.nextDouble();
                            //Account account=new Account();

                            accounts.get(i).withdraw(amount);
                            //accounts.get(i).setBalance(accounts.get(i).getBalance()-amount);
                            System.out.println("your balance Now = " + accounts.get(i).getBalance());//account.getBalance());

                        }
                        else if(choice==2)
                        {
                            System.out.println("Enter Amount : ");
                            amount=input.nextDouble();
                            accounts.get(i).deposit(amount);
                            System.out.println("your balance Now = " + accounts.get(i).getBalance() );
                        }
                        else if(choice==3)
                        {
                            break;
                        }
                    }
                    else
                    {
                        System.out.println("not found");
                    }
                }
            }
            else
            {
                System.out.println("wrong input");
            }
        }
    }
}
