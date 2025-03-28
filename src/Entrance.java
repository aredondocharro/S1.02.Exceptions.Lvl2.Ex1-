import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrance {
    private static final Scanner sn = new Scanner(System.in);

    public static void clearBuffer() {
        sn.nextLine();
    }

    public static byte readByte(String message) {
        System.out.println(message);
        return sn.nextByte();

    }

    public static int readInt(String message) {
        System.out.println(message);
        return sn.nextInt();
    }

    public static float readFloat(String message) {
        System.out.println(message);
        return sn.nextFloat();
    }

    public static double readDouble(String message) {
        System.out.println(message);
        return sn.nextDouble();
    }

    public static char readChar(String message) {
        System.out.println(message);
        String input = sn.nextLine().trim();

        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            return input.charAt(0);
        } else {
            throw new InputMismatchException("Insert a single letter.");
        }
    }

    public static String readString(String message) {
        System.out.println(message);
        String input = sn.nextLine().trim();
        if (!input.matches("[A-Za-zÀ-ÖØ-öø-ÿ\\s]+")) {
            throw new InputMismatchException("Only letters and spaces.");
        }
        return input;
    }

    public static boolean readYesNo(String message) {
        System.out.println(message + " (y/n): ");
        String input = sn.nextLine().trim().toLowerCase();

        if (input.equals("y")) {
            return true;
        } else if (input.equals("n")) {
            return false;
        } else {
            throw new InputMismatchException("Insert 'y' for yes or 'n' for no.");
        }
    }
}