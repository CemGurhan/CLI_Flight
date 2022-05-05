package Objects;

import MethodClasses.BookFlight;

import java.util.ArrayList;
import java.util.List;

public class Flight {

    private String destination;
    private int id;
    private List<Passenger> passengers;
    private boolean isReturn;
    private int departureTime;

    private String departureDate;

    public Flight(String destination, int flightNumber, boolean isReturn, int departTime, String departDate) {

        this.destination = destination;
        this.id = flightNumber;
        this.isReturn = isReturn;
        this.departureTime = departTime;
        this.departureDate = departDate;
        passengers = new ArrayList<>();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return id;
    }

    public void setFlightNumber(int flightNumber) {
        this.id = flightNumber;
    }



    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public boolean isReturn() {
        return isReturn;
    }

    public void setReturn(boolean aReturn) {
        isReturn = aReturn;
    }

    @Override
    public String toString(){
        return "Flight info: destination: " + this.destination + ", flight number: " + this.id +
                ", departure date and time: " + this.departureDate + ", " + this.departureTime;
    }


}
