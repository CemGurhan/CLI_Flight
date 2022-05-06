package DataBases;

import Objects.Flight;

import java.util.HashMap;

public abstract class FlightDB {

    public static int counter =0;
    public static HashMap<Integer, Flight> flightDB = new HashMap<>();
}
