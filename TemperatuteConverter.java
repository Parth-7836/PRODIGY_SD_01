import java.util.Scanner;
public class TemperatuteConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        double Celsius = scanner.nextDouble();

        // Calculate Kelvin and Fahrenheit
        double Kelvin = Celsius + 273.15;
        double Fahrenheit = (Celsius * 9/5) + 32;

        // Display results
        System.out.println("Kelvin: " + Kelvin);
        System.out.println("Fahrenheit: " + Fahrenheit);

        scanner.close();
    }
}
