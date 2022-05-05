package Objects;

import MethodClasses.BookFlight;

import java.awt.print.Book;
import java.util.Scanner;

public class Passenger  {


    private String name;
    private int id;
    private ContactInfo contactInfo;


    public Passenger(String name, int id, ContactInfo contactInfo) {
        this.name = name;
        this.id = id;
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }



}
