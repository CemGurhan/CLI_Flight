import MethodClasses.AddFlight;
import Objects.Flight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Flights.Flights;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FlightsTest {

    private Flight flight1;

    @BeforeEach

    void setup(){
        flight1 = new Flight("here",4, false, 1400,"5TH MAY");
    }

    @Test

    void emptyFlightsListTest(){

        assertTrue(Flights.getFlights().isEmpty());


    }

    @Test

    void addFlight(){

        AddFlight.addFlight(flight1);

        assertEquals(1,Flights.getFlights().size());


    }






}
