import DataBases.FlightDB;
import MethodClasses.AddFlight;
import MethodClasses.BookFlight;
import MethodClasses.CancelFlight;

import MethodClasses.SearchFlightDestination;
import Objects.Flight;
import Objects.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Flights.Flights;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FlightsTest {

    private Flight flight1;
    private Passenger passenger;

    @BeforeEach

    void setup(){
        flight1 = new Flight("here",4,  1400,"5TH MAY");

    }

    @Test

    void emptyFlightsListTest(){
//        System.out.println(Flights.getFlights());
        assertTrue(Flights.getFlights().isEmpty());


    }

    @Test

    void addFlightTest(){

        AddFlight.addFlightNonMain(flight1);

//        System.out.println(Flights.getFlights());

        assertEquals(1,Flights.getFlights().size());


    }

    @Test
    void bookFlight(){

        BookFlight.bookFlight(passenger, flight1);
        assertEquals(1, flight1.getPassengers().size());
    }

    @Test

    void cancelFlightAsAirline(){

        AddFlight.addFlightNonMain(flight1);
        CancelFlight.cancelFlightAsAirline(flight1);
        assertEquals(Flights.getFlights().size(),0);

    }

    @Test

    void cancelFlightAsPassenger(){ //wait till addPassenger method done


        BookFlight.bookFlight(passenger, flight1);
        CancelFlight.cancelFlightAsPassenger(flight1, passenger);
        assertEquals(flight1.getPassengers().size(),0);

    }

    @Test
    void searchdestinationWithNewFlightObject(){

        AddFlight.addFlightNonMain(new Flight("destination", FlightDB.counter++,1,"date"));
        assertEquals(SearchFlightDestination.searchDestination("destination").get(0).getDestination(),"destination");


//        System.out.println(flight1.getDestination());
//        System.out.println(SearchFlightDestination.searchDestination("here"));
    }








}
