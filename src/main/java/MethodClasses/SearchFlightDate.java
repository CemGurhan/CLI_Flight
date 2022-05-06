package MethodClasses;

import Flights.Flights;
import Objects.Flight;

import java.util.List;

public abstract class SearchFlightDate {

    public static List<Flight> searchDates(String departDate){

       return Flights.getFlights().stream().filter(flightEl -> flightEl.getDepartureDate().equals(departDate)).toList();

    }
}
