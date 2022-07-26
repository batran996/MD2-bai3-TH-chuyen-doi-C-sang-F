import java.util.Scanner;

public class Main {
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0/5) * celsius +32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5/9) * (fahrenheit - 32);
        return celsius;
    }
    public static void main(String[] args) {
        System.out.println("Doi tu C sang F!");
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("enter fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;}
                case 2:{
                    System.out.println("enter celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                }

                case 0:
                    System.exit(0);
            }
        }while (choice != 0);

    }
}