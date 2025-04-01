import java.util.Scanner;

class StringBuilderExample {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        StringBuilder sb = new StringBuilder(input);
        
        // Append text
        sb.append(" is awesome!");
        System.out.println("After append: " + sb);
        
        // Insert text
        sb.insert(0, "Java: ");
        System.out.println("After insert: " + sb);
        
        // Reverse the string
        sb.reverse();
        System.out.println("Reversed String: " + sb);
        
        scanner.close();
    }
}
