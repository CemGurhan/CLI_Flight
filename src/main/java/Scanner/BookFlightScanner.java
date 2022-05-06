package Scanner;

import DataBases.FlightDB;
import MethodClasses.BookFlight;
import MethodClasses.SearchFlightDate;
import MethodClasses.SearchFlightDestination;
import MethodClasses.SearchFlightID;
import Objects.Flight;
import Objects.Passenger;

import java.util.Scanner;

public class BookFlightScanner {

    public static void bookFlightScanner(Scanner scanner){

        scanner = new Scanner(System.in);

        System.out.println("Where would you like to go?; ");
        String input_destination = scanner.nextLine();
        System.out.println("What date would you like to choose?: ");
        String input_date = scanner.nextLine();

        //searchFlightDestination(input_destination);

        SearchFlightDate.searchDates(input_date);

    }
}
