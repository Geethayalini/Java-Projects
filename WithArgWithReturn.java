import java.util.Scanner;

class WithArgWithReturn {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the temperature in Celsius: ");
        double temperature = scanner.nextDouble();
        
        String weatherCondition = predictWeather(temperature);
        System.out.println("Weather Prediction: " + weatherCondition);
        
        scanner.close();
    }
    
    public static String predictWeather(double temperature) {
        if (temperature > 30) {
            return "It's a hot day!";
        } else if (temperature >= 20 && temperature <= 30) {
            return "The weather is warm.";
        } else if (temperature >= 10 && temperature < 20) {
            return "It's a cool day.";
        } else {
            return "It's a cold day!";
        }
    }
}