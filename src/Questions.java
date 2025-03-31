
public class Questions {
    public static void ageQuestion() {
        byte age;
        boolean ageQuestion = false;
        while (!ageQuestion) {
            age = Entrance.readByte("Enter your age: ");
            if (Filter.ageFilter(age)) {
                System.out.println("Your age is " + age);
                ageQuestion = true;
            } else {
                System.out.println("Enter an age between 0 and 120 years.");
            }
        }
    }

    public static void yearQuestion() {
        int year;
        boolean yearQuestion = false;
        while (!yearQuestion) {
            year = Entrance.readInt("Enter the year you were born: ");
            if (Filter.yearFilter(year)) {
                System.out.println("You were born in " + year);
                yearQuestion = true;
            } else {
                System.out.println("Please, enter a year between 1900 and 2025.");
            }
        }
    }


    public static void heightQuestion() {
        float height;
        boolean heightQuestion = false;
        while (!heightQuestion) {
            height = Entrance.readFloat("Enter your height in meters: ");
            if (Filter.heightFilter(height)) {
                System.out.println("Your height is: " + height + " meters.");
                Entrance.clearBuffer();
                heightQuestion = true;
            } else {
                System.out.println("Insert a height between 0.5 and 2.50 meters");
            }
        }
    }


    public static void weightQuestion() {
        double weight;
        boolean weightQuestion = false;
        while (!weightQuestion) {
            weight = Entrance.readDouble("Enter your weight in kg: ");
            if (Filter.weightFilter(weight)) {
                System.out.println("Your weight is: " + weight + " kg.");
                Entrance.clearBuffer();
                weightQuestion = true;
            } else {
                System.out.println("Insert a weight between 30 and 300 kg");
            }
        }
    }


    public static void firstLetterQuestion() {
        char initial;
        initial = Entrance.readChar("Enter the first letter of your name: ");
        System.out.println("Your initial is: " + initial);


    }


    public static void cityQuestion() {
        String city;
        city = Entrance.readString("Enter your city: ");
        System.out.println("You live in: " + city);


    }

    public static void coffeeQuestion() {
        boolean likesCoffee;
        likesCoffee = Entrance.readYesNo("Do you like coffee?");
        System.out.println("Likes coffee: " + (likesCoffee ? "Yes" : "No"));


    }

}
