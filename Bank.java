import java.util.ArrayList;

public class Bank {

    private String name;
    private String address;
    private int phone;

    private ArrayList<Account> accounts ;

    private ArrayList<Client> clients ;

    public ArrayList<Account> getAccounts() {
        return accounts;
    }


    public ArrayList<Client> getClients() {
        return clients;
    }


    public Bank(){
    }
    public Bank(String name, String address, int phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.accounts = new ArrayList<>();
        this.clients =  new ArrayList<>();
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void addClient(String name ,String address,int phone,String NID,double balance,int accountNumber)
    {
        Client client=new Client(name,NID,address,phone);
        //Account account1=new Account();
        Account account= new Account(accountNumber,balance);
        System.out.println("*********** "+ account.getAccountNumber()+" **********");
        accounts.add(account);
        clients.add(client);

    }
    public void addSpecialClient(String name ,String address,int phone,String NID,double balance,int accountNumber)
    {
        Client client=new Client(name,NID,address,phone);
        //Account account1=new Account();
        Account account= new SpecialAccount(accountNumber,balance);
        System.out.println("*********** "+ account.getAccountNumber()+" **********");
        accounts.add(account);
        clients.add(client);
    }
    public void addCommercialClient(String name ,String address,int phone,String NID,String CID,double balance,int accountNumber)
    {

        CommercialClient commercialClient=new CommercialClient(CID,name,NID,address,phone);
        //Account account1=new Account();
        Account account= new Account(accountNumber,balance);
        getAccounts();
        getClients();
        accounts.add(account);
        clients.add(commercialClient);
    }
    public void display()
    {
        System.out.println(accounts);
        System.out.println(clients);

    }

}
