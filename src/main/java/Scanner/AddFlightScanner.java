package Scanner;

import java.util.Scanner;

public abstract class AddFlightScanner {

    Scanner scanner = new Scanner(system.in);

    public static void addFlight(){

        System.out.println("Add destination");
        String destination = scanner.nextLine();
        System.out.println("Add flight ID");
        long id = scanner.nextInt();
        System.out.println();
    }
}
