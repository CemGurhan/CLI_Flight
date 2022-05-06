package Scanner;
import Exceptions.StringException;
import Objects.ContactInfo;
import Objects.Passenger;
import DataBases.PassengerDB;

import java.util.Scanner;

public abstract class AddPassengerScanner {

//    private Scanner scanner;

    public static void passenger_info(Scanner scanner) {


        scanner = new Scanner(System.in);


        System.out.println("What's your name?: ");

        String input_name = StringException.callStringException(scanner);



        System.out.println("what's your email address?: ");
        while(!scanner.hasNextInt()){
            String input = scanner.next();
            System.out.printf("\"%s\" is not a valid input\n",input);
            System.out.println("Please enter a valid number: ");

        }
        String input_email = scanner.nextLine();



        System.out.println("what's your telephone number?: " );

        while (!scanner.hasNextLong()) {
            String input = scanner.next();
            System.out.printf("\"%s\" is not a valid number\n", input);
            System.out.print("Please enter a valid number: ");
        }
        Long input_telephone = scanner.nextLong();



        PassengerDB.passengerMap.put(++PassengerDB.counter, 
                new Passenger(input_name,
                        PassengerDB.counter,
                        new ContactInfo(input_email, input_telephone)));

        System.out.println("Welcome " + input_name + ".");

    }
}
