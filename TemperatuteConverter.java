import java.util.Scanner;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the original unit of measurement (C, F, or K): ");
        String originalUnit = scanner.next().toUpperCase();

        switch (originalUnit) {
            case "C":
                double celsius = temperature;
                double fahrenheitFromC = celsiusToFahrenheit(celsius);
                double kelvinFromC = celsiusToKelvin(celsius);
                System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit and %.2f Kelvin.\n",
                        celsius, fahrenheitFromC, kelvinFromC);
                break;
            case "F":
                double fahrenheit = temperature;
                double celsiusFromF = fahrenheitToCelsius(fahrenheit);
                double kelvinFromF = fahrenheitToKelvin(fahrenheit);
                System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius and %.2f Kelvin.\n",
                        fahrenheit, celsiusFromF, kelvinFromF);
                break;
            case "K":
                double kelvin = temperature;
                double celsiusFromK = kelvinToCelsius(kelvin);
                double fahrenheitFromK = kelvinToFahrenheit(kelvin);
                System.out.printf("%.2f Kelvin is equal to %.2f degrees Celsius and %.2f degrees Fahrenheit.\n",
                        kelvin, celsiusFromK, fahrenheitFromK);
                break;
            default:
                System.out.println("Invalid unit. Please enter C, F, or K.");
        }

        scanner.close();
    }
}
