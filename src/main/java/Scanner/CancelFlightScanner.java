package Scanner;

import Flights.Flights;
import MethodClasses.SearchFlightID;
import Objects.Flight;
import MethodClasses.CancelFlight;

import java.util.Scanner;

public abstract class CancelFlightScanner {



    public static void cancelFlightScanner(Scanner scanner){

        scanner = new Scanner(System.in);
        System.out.println("Hello, please provide the ID of the flight you'd like to cancel:");
        int flightID = scanner.nextInt();
        Flight flight = SearchFlightID.searchID(flightID);
        System.out.println("Please provide your passenger ID:");
        int passengerID = scanner.nextInt();

        CancelFlight.cancelFlightAsPassenger(flight, flight.getPassengers().stream().
                filter(passengerEl -> passengerEl.getId()==passengerID ).toList().get(0));
        System.out.println("Flight cancelled");












    }


}
