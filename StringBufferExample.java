import java.util.Scanner;

class StringBufferExample {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Using StringBuffer for string manipulation
        StringBuffer sb = new StringBuffer(input);
        
        // Append text
        sb.append(" - Java Programming");
        System.out.println("After Append: " + sb);
        
        // Insert text
        sb.insert(5, " INSERTED");
        System.out.println("After Insert: " + sb);
        
        // Reverse the string
        sb.reverse();
        System.out.println("Reversed String: " + sb);
        
        // Delete part of the string
        sb.reverse(); // Reverse back to original
        sb.delete(5, 14);
        System.out.println("After Delete: " + sb);
        
        scanner.close();
    }
}
