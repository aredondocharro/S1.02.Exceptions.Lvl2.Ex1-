# 💻  Musical Instruments System

## 📄 Description - Exercise Statement

Create a class called "Entrada" (Input). This class should be used to control the different exceptions that may occur in Java when entering data via the keyboard using the Scanner class.

The first step is to instantiate an object of the Scanner class, and then create static methods to read different types of data from the keyboard.

Important
If an exception occurs in any method, it should be handled, and the user should be prompted again for the data until it is entered correctly. For example: If a float is entered with a dot instead of a comma, it should display "Format error." The method should keep asking for the data until the user enters a properly formatted float.

All methods receive a String with the message to be displayed to the user (e.g., "Enter your age") and return the appropriate data entered by the user in each method (e.g., a byte with the user's age).

Methods to implement, catching InputMismatchException:
public static byte llegirByte(String missatge); → Read a byte

public static int llegirInt(String missatge); → Read an int

public static float llegirFloat(String missatge); → Read a float

public static double llegirDouble(String missatge); → Read a double

Methods to implement, catching a custom Exception:
public static char llegirChar(String missatge); → Read a char

public static String llegirString(String missatge); → Read a String

public static boolean llegirSiNo(String missatge); → If the user enters "s", return true; if they enter "n", return false.

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