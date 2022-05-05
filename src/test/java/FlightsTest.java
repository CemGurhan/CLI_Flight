import MethodClasses.AddFlight;
import MethodClasses.BookFlight;
import MethodClasses.CancelFlight;

import Objects.Flight;
import Objects.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Flights.Flights;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FlightsTest {

    private Flight flight1;
    private Passenger passenger;

    @BeforeEach

    void setup(){
        flight1 = new Flight("here",4, false, 1400,"5TH MAY");
        passenger = new Passenger("new",22,"hello",2222);
    }

    @Test

    void emptyFlightsListTest(){

        assertTrue(Flights.getFlights().isEmpty());


    }

    @Test

    void addFlightTest(){

        AddFlight.addFlight(flight1);

        assertEquals(1,Flights.getFlights().size());


    }

    @Test
    void bookFlight(){

        BookFlight.bookFlight(passenger, flight1);
        assertEquals(1, flight1.getPassengers().size());
    }

    @Test

    void cancelFlightAsAirline(){

        AddFlight.addFlight(flight1);
        CancelFlight.cancelFlightAsAirline(flight1);
        assertEquals(Flights.getFlights().size(),0);

    }

    @Test

    void cancelFlightAsPassenger(){ //wait till addPassenger method done


        BookFlight.bookFlight(passenger, flight1);
        CancelFlight.cancelFlightAsPassenger(flight1, passenger);
        assertEquals(flight1.getPassengers().size(),0);

    }








}
