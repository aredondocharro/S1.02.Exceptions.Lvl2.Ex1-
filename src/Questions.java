import java.util.InputMismatchException;

public class Questions {
    public static void ageQuestion() {
        byte age;
        boolean ageQuestion = false;
        while (!ageQuestion) {
            try {
                age = Entrance.readByte("Enter your age: ");
                if (Filter.ageFilter(age)) {
                    System.out.println("Your age is " + age);
                    ageQuestion = true;
                } else {
                    System.out.println("Enter an age between 0 and 120 years.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Insert a byte value");
                Entrance.clearBuffer();
            }
        }

    }

    public static void yearQuestion() {
        int year;
        boolean yearQuestion = false;
        while (!yearQuestion) {
            try {
                year = Entrance.readInt("Enter the year you were born: ");
                if (Filter.yearFilter(year)) {
                    System.out.println("You were born in " + year);
                    yearQuestion = true;
                } else {
                    System.out.println("Please, enter a year between 1900 and 2025.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error:  enter a int value");
                Entrance.clearBuffer();
            }
        }
    }

    public static void heightQuestion() {
        float height;
        boolean heightQuestion = false;
        while (!heightQuestion) {
            try {
                height = Entrance.readFloat("Enter your height in meters: ");
                if (Filter.heightFilter(height)){
                System.out.println("Your height is: " + height + " meters.");
                Entrance.clearBuffer();
                heightQuestion = true;}
                else {
                    System.out.println("Insert a height between 0.5 and 2.50 meters");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: enter a float");
                Entrance.clearBuffer();
            }
        }
    }

    public static void weightQuestion() {
        double weight;
        boolean weightQuestion = false;
        while (!weightQuestion) {
            try {
                weight = Entrance.readDouble("Enter your weight in kg: ");
                if (Filter.weightFilter(weight)){
                System.out.println("Your weight is: " + weight + " kg.");
                Entrance.clearBuffer();
                weightQuestion = true;}
                else {
                    System.out.println("Insert a weight between 30 and 300 kg");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: enter a double value");
                Entrance.clearBuffer();
            }
        }
    }

    public static void firstLetterQuestion() {
        char initial;
        boolean firstLetterQuestion = false;
        while (!firstLetterQuestion) {
            try {
                initial = Entrance.readChar("Enter the first letter of your name: ");
                System.out.println("Your initial is: " + initial);
                firstLetterQuestion = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
    }

    public static void cityQuestion() {
        String city;
        boolean cityQuestion = false;
        while (!cityQuestion) {
            try {
                city = Entrance.readString("Enter your city: ");
                System.out.println("You live in: " + city);
                cityQuestion = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static void coffeeQuestion() {
        boolean likesCoffee;
        boolean coffeeQuestion = false;
        while (!coffeeQuestion) {
            try {
                likesCoffee = Entrance.readYesNo("Do you like coffee?");
                System.out.println("Likes coffee: " + (likesCoffee ? "Yes" : "No"));
                coffeeQuestion = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
