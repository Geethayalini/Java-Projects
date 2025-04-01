import java.util.Scanner;

class WithoutArgWithReturn {
    public static void main(String args[]) {
        int number = getNumber();
        String result = checkNumberSign(number);
        System.out.println("The number is: " + result);
    }
    
    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }
    
    public static String checkNumberSign(int num) {
        if (num > 0) {
            return "Positive";
        } else if (num < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }
}