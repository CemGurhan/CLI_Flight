package Exceptions;

import java.util.Scanner;

public abstract class StringException {

    public static String callStringException(Scanner scanner){
        while(scanner.hasNext()){
            int input = scanner.nextInt();
            System.out.printf("\"%s\" is not a valid input\n", input);
            System.out.println("Please enter a valid name");

            if(scanner.hasNext()){

                return scanner.nextLine();
            }
        }
        return null;
    }



}
