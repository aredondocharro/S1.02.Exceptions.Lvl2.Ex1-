import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrance {
    private static final Scanner sn = new Scanner(System.in);

    public static void clearBuffer() {
        sn.nextLine();
    }

    public static byte readByte(String message) {
        while (true) {
            try {
                System.out.println(message);
                return sn.nextByte();

            } catch (InputMismatchException e) {
                System.out.println("Error: Insert a byte value");
                Entrance.clearBuffer();
            }
        }

    }

    public static int readInt(String message) {

        while (true) {
            try {
                System.out.println(message);
                return sn.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Error: Insert a integer value");
                Entrance.clearBuffer();
            }
        }

    }


    public static float readFloat(String message) {
        while (true) {
            try {
                System.out.println(message);
                return sn.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Error: Insert a float value");
                Entrance.clearBuffer();
            }
        }

    }

    public static double readDouble(String message) {

        while (true) {
            try {
                System.out.println(message);
                return sn.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error: Insert a double value");
                Entrance.clearBuffer();
            }
        }


    }

    public static char readChar(String message) {
        while (true) {
            System.out.println(message);
            String entryChar = sn.nextLine().trim();
            if (entryChar.length() == 1 && Character.isLetter(entryChar.charAt(0))) {
                return entryChar.charAt(0);
            }

            System.out.println("Error: Please enter only a single letter.");
        }
    }


    public static String readString(String message) {
        while (true) {
            System.out.println(message);
            String entryString = sn.nextLine().trim();

            if (entryString.matches("[A-Za-zÀ-ÖØ-öø-ÿ\\s]+")) {
                return entryString;
            }

            System.out.println("Error: Only letters and spaces.");
        }
    }

    public static boolean readYesNo(String message) {
        while (true) {
            System.out.println(message + " (y/n): ");
            String entryBoolean = sn.nextLine().trim().toLowerCase();
            if (entryBoolean.equalsIgnoreCase("y")) {
                return true;
            }
            if (entryBoolean.equalsIgnoreCase("n")) {
                return false;
            }
            System.out.println("Error: Only 'Y' for yes and 'N' for no.");

        }

    }

}
