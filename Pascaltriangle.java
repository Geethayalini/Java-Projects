import java.util.Scanner;
class Pascaltriangle{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = scanner.nextInt();
        printPascalsTriangle(n);
        scanner.close();
    }
    public static void printPascalsTriangle(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            int number = 1;
            for (int j = 0; j <= i; j++){
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}