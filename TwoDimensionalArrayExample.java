import java.util.Scanner;

class TwoDimensionalArrayExample {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        
        int[][] numbers = new int[rows][cols];
        
        System.out.println("Enter " + (rows * cols) + " numbers:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Two-Dimensional Array Elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
