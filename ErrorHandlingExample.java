import java.util.Scanner;

class ErrorHandlingExample {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } finally {
            scanner.close();
            System.out.println("Scanner closed.");
        }
    }
}
