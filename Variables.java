import java.util.Scanner;

class Variables {
    public static void main(String args[]) {
        // Local Variable
        int localVar = 10;
        System.out.println("Local Variable: " + localVar);
        
        // Instance Variable (inside a class but outside a method)
        ExampleClass obj = new ExampleClass();
        System.out.println("Instance Variable: " + obj.instanceVar);
        
        // Static Variable
        System.out.println("Static Variable: " + ExampleClass.staticVar);
        
        // Constant Variable (final keyword)
        final double PI = 3.14159;
        System.out.println("Constant Variable (PI): " + PI);
    }
}

class ExampleClass {
    int instanceVar = 20; // Instance variable
    static int staticVar = 30; // Static variable
}
