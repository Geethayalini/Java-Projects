import java.util.Scanner;

class VolumeCalculator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        // Volume of a Sphere
        System.out.print("Enter the radius of the sphere: ");
        double sphereRadius = scanner.nextDouble();
        double sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(sphereRadius, 3);
        System.out.println("Volume of the Sphere: " + sphereVolume);
        
        // Volume of a Cylinder
        System.out.print("Enter the radius of the cylinder: ");
        double cylinderRadius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double cylinderHeight = scanner.nextDouble();
        double cylinderVolume = Math.PI * Math.pow(cylinderRadius, 2) * cylinderHeight;
        System.out.println("Volume of the Cylinder: " + cylinderVolume);
        
        scanner.close();
    }
}