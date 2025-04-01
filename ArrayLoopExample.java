import java.util.Scanner;

class ArrayLoopExample {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < numbers.length; i++) { // Using length property
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("Array elements using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        
        System.out.println("\nArray elements using for-each loop:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}