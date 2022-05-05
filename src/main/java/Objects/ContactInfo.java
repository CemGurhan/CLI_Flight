package Objects;

public class ContactInfo{


    private String emailAddress;
    private int telephoneNumber;

    public ContactInfo(String emailAddress, int telephoneNumber, String address) {
        this.emailAddress = emailAddress;
        this.telephoneNumber = telephoneNumber;
        this.address = address;
    }

    private String address;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
