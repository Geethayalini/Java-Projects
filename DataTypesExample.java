import java.util.Scanner;

class DataTypesExample {
    public static void main(String[] args) {
        // Integer types
        byte byteVar = 127; // -128 to 127
        short shortVar = 32000; // -32,768 to 32,767
        int intVar = 100000; // -2^31 to 2^31-1
        long longVar = 10000000000L; // -2^63 to 2^63-1
        
        // Floating-point types
        float floatVar = 10.5f; // Single precision
        double doubleVar = 20.99; // Double precision
        
        // Character type
        char charVar = 'A';
        
        // Boolean type
        boolean booleanVar = true;
        
        // Displaying values
        System.out.println("Byte Value: " + byteVar);
        System.out.println("Short Value: " + shortVar);
        System.out.println("Int Value: " + intVar);
        System.out.println("Long Value: " + longVar);
        System.out.println("Float Value: " + floatVar);
        System.out.println("Double Value: " + doubleVar);
        System.out.println("Char Value: " + charVar);
        System.out.println("Boolean Value: " + booleanVar);
    }
}