package MethodClasses;
import Flights.Flights;
import Objects.Flight;

public abstract class SearchFlightID {

    public static Flight searchID(int flightID){

        return Flights.getFlights().stream().filter(flightEl -> flightEl.getFlightNumber()==flightID)
                .toList().get(0);

    }
}
