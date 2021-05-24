public class Client {
    private String name;
    private String nationalID;
    private String address;
    private int phone;
    private Account account;


    public Client(String name, String nationalID, String address, int phone) {
        this.name = name;
        this.nationalID = nationalID;
        this.address = address;
        this.phone = phone;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
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
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", nationalID=" + nationalID +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", account=" + account +
                '}';
    }
}
