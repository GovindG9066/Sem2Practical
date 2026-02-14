public class College1 {
    private int Cid;
    private String Cname;
    private Address1 adr;

    public int getCid() {
        return Cid;
    }

    public void setCid(int cid) {
        Cid = cid;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public Address1 getAdr() {
        return adr;
    }

    public void setAdr(Address1 adr) {
        this.adr = adr;
    }

    public String getCEmail() {
        return CEmail;
    }

    public void setCEmail(String CEmail) {
        this.CEmail = CEmail;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    private String CEmail;
    private int pincode;
}
