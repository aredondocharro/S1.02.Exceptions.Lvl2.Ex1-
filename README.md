# 💻  InputMismatchExceptions handle

## 📄 Description - Exercise Statement

Create a class called "Entrance". This class should be used to control the different exceptions that may occur in Java when entering data via the keyboard using the Scanner class.

The first step is to instantiate an object of the Scanner class, and then create static methods to read different types of data from the keyboard.

Important
If an exception occurs in any method, it should be handled, and the user should be prompted again for the data until it is entered correctly. For example: If a float is entered with a dot instead of a comma, it should display "Format error." The method should keep asking for the data until the user enters a properly formatted float.

All methods receive a String with the message to be displayed to the user (e.g., "Enter your age") and return the appropriate data entered by the user in each method (e.g., a byte with the user's age).

Methods to implement, catching InputMismatchException:
public static byte readByte(String message); → Read a byte

public static int readInt(String message); → Read an int

public static float readFloat(String message); → Read a float

public static double readDouble(String message); → Read a double

Methods to implement, catching a custom Exception:
public static char readChar(String message); → Read a char

public static String readString(String message); → Read a String

public static boolean readSiNo(String message); → If the user enters "y", return true; if they enter "n", return false.

## 💻 Technologies Used

- IntelliJ IDEA Community Edition 2024.3.4.1

## 📋 Requirements

- IntelliJ IDEA

## 🛠️ Installation

**Clone:**
1. File > New > Project from Version Control
2. Paste GitHub URL
3. Select destination folder

**Configure:**
1. Open File > Project Structure
2. Assign correct JDK (Java 8/11/17...)

**Dependencies:**
- For Maven: Click "Load IntelliJ IDEA Project"
- For Maven: Click "Load Maven Project"
- For Gradle: Click "Load Gradle Project"

**Run:**
1. Locate class with `public static void main`
2. Right-click > Run 'Class.main()'  