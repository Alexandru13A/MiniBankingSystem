package PersonService;

import Model.Person;

import java.util.Scanner;

public class PinValidation {

    public static final int MAX_ATTEMPTS = 3;

    public boolean pinCheck(Scanner sc, String personPin) {

        int attempts = 0;
        while (attempts < MAX_ATTEMPTS) {
            System.out.println("Enter the pin:");
            String pin = sc.next();
            if (pin.equals(personPin)) {
                System.out.println("Correct PIN.");
                return true;
            } else {
                System.out.println("Incorrect PIN");
                attempts++;
            }
        }
        return false;

    }

}
