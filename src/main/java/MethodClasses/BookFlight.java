package MethodClasses;

import Flights.Flights;
import Objects.Passenger;
import Objects.Flight;

import java.util.List;

public abstract class BookFlight extends Flights {

    public static void bookFlight(Passenger passenger, Flight flight){

        flight.getPassengers().add(passenger);
    }


}
