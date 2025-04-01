import java.util.Scanner;
class Reversenumber{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversed = reverseNumber(number);
        System.out.println("Reverse Number: " + reversed);
        scanner.close();
    }
    public static int reverseNumber(int num){
        int reversed = 0;
        while (num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}