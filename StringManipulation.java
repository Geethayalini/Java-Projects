import java.util.Scanner;

class StringManipulation {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Convert to uppercase
        String upperCase = input.toUpperCase();
        System.out.println("Uppercase: " + upperCase);
        
        // Convert to lowercase
        String lowerCase = input.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);
        
        // Find length of string
        int length = input.length();
        System.out.println("Length of string: " + length);
        
        // Reverse the string
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed String: " + reversed);
        
        scanner.close();
    }
}
