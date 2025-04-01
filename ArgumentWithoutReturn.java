import java.util.Scanner;

class ArgumentWithoutReturn {
    // Method with argument and without return type
    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }
    }
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Calling method with argument
        checkEvenOdd(num);
        
        scanner.close();
    }
}
