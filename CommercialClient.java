public class CommercialClient extends Client {
    private String commercialID;

    public CommercialClient(String commercialID, String name, String nationalID, String address, int phone) {
        super(name, nationalID, address, phone);
        this.commercialID = commercialID;
    }

    public String getCommercialID() {
        return commercialID;
    }

    public void setCommercialID(String commercialID) {
        this.commercialID = commercialID;
    }

    @Override
    public String toString() {
        return "CommercialClient{" +
                "commercialID=" + commercialID +
                '}';
    }
}
