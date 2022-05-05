package MethodClasses;

import Flights.Flights;
import Objects.Flight;

public abstract class AddFlight extends Flights {

    public static void addFlight(Flight flight){
        getFlights().add(flight);
    }




}
