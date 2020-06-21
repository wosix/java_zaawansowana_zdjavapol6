package exceptions;

import strings.StringOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Who are you?");
        String name = scanner.nextLine();

        try {
            greet(name);
        }
//        catch (IllegalArgumentException exception) {
//            System.out.println("Error found: " + exception.getMessage());
//        }
        catch (InvalidNameException exception) {
            System.out.println(exception.getMessage());
        }

        // ArrayIndexOutOfBoundsException

        try {
            int[] tab = {3, 4, 5};
            System.out.println(tab[3]);
            System.out.println("Koniec try");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Wylazłes poza zakres");
        } finally {
            System.out.println("Ja lece pa");
        }


        try {
            String text = null;
            int lenght = text.length();
            System.out.println("jestem tutaj");
        } catch (NullPointerException exception) {
            System.out.println("Pusto jest");
        } finally {
            System.out.println("Zamykam!!");
        }
    }


    private static void greet(String who) throws InvalidNameException {
        if (who == null || who.isBlank()) {
            //throw new IllegalArgumentException("Input cannot be blank!");
            throw new InvalidNameException(who);
        }

        String message = String.format("Hello, %s!", who);
        System.out.println(message);
    }

    public static class InvalidNameException extends Exception {

        public InvalidNameException(String invalidName) {
            super(String.format("Name [%s] is invalid", invalidName));
        }
    }
}
