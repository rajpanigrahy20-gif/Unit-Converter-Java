import java.util.Scanner;

public class unit_converter {

    // Method to convert KM to Miles
    public static void kmToMiles(double km) {
        double miles = km * 0.621371;
        System.out.println("Miles = " + miles);
    }

    // Method to convert KG to Pounds
    public static void kgToPounds(double kg) {
        double pounds = kg * 2.20462;
        System.out.println("Pounds = " + pounds);
    }

    // Method to convert Celsius to Fahrenheit
    public static void celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Fahrenheit = " + fahrenheit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== Unit Converter =====");
            System.out.println("1. KM to Miles");
            System.out.println("2. KG to Pounds");
            System.out.println("3. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter distance in KM: ");
                    double km = sc.nextDouble();
                    kmToMiles(km);
                    break;

                case 2:
                    System.out.print("Enter weight in KG: ");
                    double kg = sc.nextDouble();
                    kgToPounds(kg);
                    break;

                case 3:
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = sc.nextDouble();
                    celsiusToFahrenheit(celsius);
                    break;

                case 0:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println();
        } while (choice != 0);

        sc.close();
    }
}