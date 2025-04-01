import java.util.Scanner;
class Armstrongnumber{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isArmstrong(number)){
            System.out.println(number + " is an Armstrong number.");
        }
        else {
            System.out.println(number + " is NOT an Armstrong number.");
        }
        scanner.close();
    }
    public static boolean isArmstrong(int num){
        int originalNum = num, sum = 0, digits = 0;
        int temp = num;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }
        temp = num;
        while (temp > 0){
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == originalNum;
    }
}