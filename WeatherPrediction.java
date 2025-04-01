import java.util.Scanner;

class WeatherPrediction {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the temperature in Celsius: ");
        double temperature = scanner.nextDouble();
        
        if (temperature > 30) {
            System.out.println("It's a hot day!");
        } else if (temperature >= 20 && temperature <= 30) {
            System.out.println("The weather is warm.");
        } else if (temperature >= 10 && temperature < 20) {
            System.out.println("It's a cool day.");
        } else {
            System.out.println("It's a cold day!");
        }
        
        scanner.close();
    }
}