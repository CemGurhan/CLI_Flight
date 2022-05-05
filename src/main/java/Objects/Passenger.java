package Objects;

public class Passenger {

    private String name;
    private ContactInfo contactInfo;
    private long passportNumber;

    public Passenger(String name, ContactInfo contactInfo, long passportNumber) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.passportNumber = passportNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public long getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(long passportNumber) {
        this.passportNumber = passportNumber;
    }
}
