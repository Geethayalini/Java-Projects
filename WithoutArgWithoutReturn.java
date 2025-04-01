import java.util.Scanner;

class WithoutArgWithoutReturn {
    public static void main(String args[]) {
        checkEvenOrOdd();
    }
    
    static void checkEvenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        
        scanner.close();
    }
}
