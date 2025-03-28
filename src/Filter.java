public class Filter {

    public static boolean ageFilter(byte age) {
        if (age >= 0 && age <= 120) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean yearFilter(int year) {
        if (year >= 1900 && year <= 2025) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean heightFilter(float height) {
        if (height >= 0.5 && height <= 2.5) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean weightFilter(double weight) {
        if (weight >= 30 && weight <= 300) {
            return true;
        } else {
            return false;
        }
    }

}
