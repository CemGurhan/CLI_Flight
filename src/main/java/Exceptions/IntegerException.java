package Exceptions;

import java.util.Scanner;

public  abstract class IntegerException {

    public static void integerException(Scanner scanner){
        while(!scanner.hasNextInt()){
            String input = scanner.next();
            System.out.printf("\"%s\" is not a valid input\n", input);
            System.out.println("Please enter a valid number");
        }
    }
}
