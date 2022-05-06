package Menus;

import DataBases.FlightDB;
import Flights.Flights;
import MethodClasses.SearchFlightDestination;
import Objects.Flight;

import java.util.List;
import java.util.Scanner;

import static Scanner.AddPassengerScanner.*;
import static Scanner.CancelFlightScanner.*;
import static Scanner.BookFlightScanner.*;
import static Scanner.AddFlightScanner.*;
import static MethodClasses.SearchFlightDestination.*;


public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuSelection;
        do {
            welcomeMenu();

            menuSelection = scanner.nextInt();
            System.out.println(menuSelection + ") ");
            switch (menuSelection) {
                case 1 -> {
                    passenger_info(scanner);
                } case 2 -> {
                    bookFlightScanner(scanner);
                } case 3 -> {
                    cancelFlightScanner(scanner);
                }case 4 -> {
                   searchDestination(scanner);
                }case 5 -> {
                    addFlight(scanner);
                }
                case 0 -> System.out.println("Thank you and goodbye!");
            }
        } while (menuSelection !=0);
    }



    private static void welcomeMenu(){
        System.out.println("");
        System.out.println("=================");
        System.out.println("All flights: " + Flights.getFlights());
        System.out.println("Select an option: ");
        System.out.println("1) Add a passenger");
        System.out.println("2) Book a flight");
        System.out.println("3) Cancel flight");
        System.out.println("4) Search flight");
        System.out.println("5) Add flight");
        System.out.println("0) Quit");
        System.out.println("==================");
    }

    private static void searchDestination(Scanner scanner){
        String searchinput;
        System.out.print("Please select a destination: ");
        scanner.nextLine();
        searchinput = scanner.nextLine();
        List<Flight> flights = SearchFlightDestination.searchDestination(searchinput);
        System.out.println(flights);
    }



}
