import java.util.Scanner;
class AreaofShapes{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose a shape to calculate the area:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Square");
            System.out.println("5. Parallelogram");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Area of Circle: " + calculateCircleArea(radius));
                    break;
                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    System.out.println("Area of Rectangle: " + calculateRectangleArea(length, width));
                    break;
                case 3:
                    System.out.print("Enter the base of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double height = scanner.nextDouble();
                    System.out.println("Area of Triangle: " + calculateTriangleArea(base, height));
                    break;
                case 4:
                    System.out.print("Enter the side of the square: ");
                    double side = scanner.nextDouble();
                    System.out.println("Area of Square: " + calculateSquareArea(side));
                    break;
                case 5:
                    System.out.print("Enter the base of the parallelogram: ");
                    double pBase = scanner.nextDouble();
                    System.out.print("Enter the height of the parallelogram: ");
                    double pHeight = scanner.nextDouble();
                    System.out.println("Area of Parallelogram: " + calculateParallelogramArea(pBase, pHeight));
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please choose again.");
            }
        }
    }
    // Method to calculate the area of a circle
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a rectangle
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a triangle
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Method to calculate the area of a square
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    // Method to calculate the area of a parallelogram
    public static double calculateParallelogramArea(double base, double height) {
        return base * height;
    }
}