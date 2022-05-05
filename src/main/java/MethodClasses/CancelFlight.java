package MethodClasses;
import Flights.Flights;
import Objects.Flight;
import Objects.Passenger;

import java.util.Scanner;

public abstract class CancelFlight extends Flights{



    public static void cancelFlightAsAirline(Flight flight){


        Flights.getFlights().removeIf(flightEl -> Flights.getFlights().contains(flight));
    }

    public static void cancelFlightAsPassenger(Flight flight, Passenger passenger){

        flight.getPassengers().removeIf(flightEl -> flight.getPassengers().contains(passenger));
    }


}
