package MethodClasses;

import Objects.Flight;
import Objects.Passenger;

import java.util.List;

public abstract class BookFlightChecker {

    public static void flightChecker(Passenger passenger, Flight flight){

        List<Passenger> filteredList=  flight.getPassengers().stream().filter(flightEl -> flightEl==passenger).toList();
        if(filteredList.size()>=1){
            System.out.println("You've already been booked onto this flight.");
        }
    }


}
