package MethodClasses;

import Flights.Flights;
import Objects.Flight;

import java.util.List;

public abstract class SearchFlightDestination {

    public static List<Flight> searchDestination (String searchdestination){

        System.out.println(Flights.getFlights().stream().filter(x -> x.getDestination().equals(searchdestination)).toList());

        return Flights.getFlights().stream().filter(x -> x.getDestination().equals(searchdestination)).toList();

    }
}
