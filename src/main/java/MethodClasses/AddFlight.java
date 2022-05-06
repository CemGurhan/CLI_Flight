package MethodClasses;

import Flights.Flights;
import Objects.Flight;

public abstract class AddFlight extends Flights {

    public static void addFlightNonMain(Flight flight){
        getFlights().add(flight);
    }




}
