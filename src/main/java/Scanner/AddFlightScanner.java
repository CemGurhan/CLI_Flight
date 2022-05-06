package Scanner;

import MethodClasses.AddFlight;
import Objects.Flight;
import DataBases.FlightDB;

import java.util.Scanner;

public abstract class AddFlightScanner  {



    public static void addFlight(Scanner scanner){
        scanner = new Scanner(System.in);

        System.out.println("Add destination");
        while(!scanner.hasNext()){
            int input = scanner.nextInt();
            System.out.printf("\"%s\" is not a valid input\n", input);
            System.out.println("Please enter a valid destination");
        }

        String destination = scanner.nextLine();


        System.out.println("Add flight depart time");


        while(!scanner.hasNextInt()){
            String input = scanner.next();
            System.out.printf("\"%s\" is not a valid input\n",input);
            System.out.println("Please enter a valid number: ");

        }
        int time = scanner.nextInt();


        System.out.println("Add flight depart date");
        while(!scanner.hasNext()){
            int input = scanner.nextInt();
            System.out.printf("\"%s\" is not a valid input\n",input);
            System.out.println("Please enter a valid:  ");

        }

        String date = scanner.nextLine();

        scanner.nextLine();

        FlightDB.flightDB.put(FlightDB.counter++,new Flight(destination,FlightDB.counter++,time,date));
        AddFlight.addFlightNonMain(new Flight(destination,FlightDB.counter++,time,date));




    }
}
