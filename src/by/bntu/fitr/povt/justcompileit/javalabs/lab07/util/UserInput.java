package by.bntu.fitr.povt.justcompileit.javalabs.lab07.util;

import java.util.Scanner;


public class UserInput {

    private static final Scanner scanner = new Scanner(System.in);

    public static int inputInt(String msg) {

        System.out.print(msg);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Wrong type of data. Please input integer value...");
            scanner.nextLine();
            return inputInt(msg);
        }
    }

    public static char inputChar(String msg) {

        System.out.print(msg);
        return scanner.next().charAt(0);

    }
}
