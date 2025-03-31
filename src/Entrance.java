import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrance {
    private static final Scanner sn = new Scanner(System.in);

    public static void clearBuffer() {
        sn.nextLine();
    }

    public static byte readByte(String message) {
        boolean byteOk = false;
        byte entryByte = 0;
        while (!byteOk) {
            try {
                System.out.println(message);
                entryByte = sn.nextByte();
                byteOk = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Insert a byte value");
                Entrance.clearBuffer();
            }
        }
        return entryByte;
    }

    public static int readInt(String message) {
        boolean intOk = false;
        int entryInt = 0;
        while (!intOk) {
            try {
                System.out.println(message);
                entryInt = sn.nextInt();
                intOk = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Insert a integer value");
                Entrance.clearBuffer();
            }
        }
        return entryInt;
    }


    public static float readFloat(String message) {
        boolean floatOk = false;
        float entryFloat = 0;
        while (!floatOk) {
            try {
                System.out.println(message);
                entryFloat = sn.nextFloat();
                floatOk = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Insert a float value");
                Entrance.clearBuffer();
            }
        }
        return entryFloat;
    }

    public static double readDouble(String message) {
        boolean doubleOk = false;
        double entryDouble = 0.0;
        while (!doubleOk) {
            try {
                System.out.println(message);
                entryDouble = sn.nextDouble();
                doubleOk = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Insert a double value");
                Entrance.clearBuffer();
            }
        }
        return entryDouble;

    }

    public static char readChar(String message) {
        boolean charOk = false;
        String entryChar = "";
        while (!charOk) {
            try {
                System.out.println(message);
                entryChar = sn.nextLine().trim();
                if (!(entryChar.length() == 1 && Character.isLetter(entryChar.charAt(0)))) {
                    throw new SingleCharacterException();
                } else {
                    charOk = true;
                }
            } catch (SingleCharacterException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return entryChar.charAt(0);
    }


    public static String readString(String message) {
        boolean stringOk = false;
        String entryString = "";
        while (!stringOk) {
            try {
                System.out.println(message);
                entryString = sn.nextLine().trim();
                if (!entryString.matches("[A-Za-zÀ-ÖØ-öø-ÿ\\s]+")) {
                    throw new StringLettersException();
                } else {
                    stringOk = true;
                }
            } catch (StringLettersException e) {
                System.out.println("Error: " + e);
            }
        }
        return entryString;
    }

    public static boolean readYesNo(String message) {
                boolean booleanOk = false;
                boolean booleanYesNo = false;
        while (!booleanOk) {
            try {
                System.out.println(message + " (y/n): ");
                String entryBoolean = sn.nextLine().trim().toLowerCase();
                if (entryBoolean.equals("y")) {
                    booleanYesNo = true;
                } else if (entryBoolean.equals("n")) {
                    booleanYesNo = false;
                } else {
                    throw new BooleanException();
                }
            } catch (BooleanException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return booleanYesNo;
    }

}
