import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class MathAndDateTime {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        // Math Operations
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        
        System.out.println("Square root: " + Math.sqrt(num));
        System.out.println("Power (number^2): " + Math.pow(num, 2));
        System.out.println("Absolute value: " + Math.abs(num));
        System.out.println("Ceil value: " + Math.ceil(num));
        System.out.println("Floor value: " + Math.floor(num));
        
        // Date and Time Operations
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = now.format(formatter);
        
        System.out.println("Current Date and Time: " + formattedDate);
        
        scanner.close();
    }
}