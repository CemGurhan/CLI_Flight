package Scanner;
import Objects.ContactInfo;
import Objects.Passenger;
import Objects.PassengerDB;

import java.util.Scanner;

public abstract class AddPassenger {

    private Scanner scanner;

    public  static void passenger_info(Scanner scanner) {


        Scanner passenger_input = new Scanner(System.in);

        System.out.println("What's your name?: ");
        String input_name = passenger_input.nextLine();
        System.out.println("what's your email address?: ");
        String input_email = passenger_input.nextLine();
        System.out.println("what's your telephone number?: ");
        int input_telephone = passenger_input.nextInt();
        System.out.println("What's your address? : ");
        String input_address = passenger_input.nextLine();

        PassengerDB.passengerMap.put(++PassengerDB.counter, 
                new Passenger(input_name,
                        PassengerDB.counter,
                        new ContactInfo(input_email, input_telephone, input_address)));




//
//        Passenger newPassenger = new Passenger();
    }
}
