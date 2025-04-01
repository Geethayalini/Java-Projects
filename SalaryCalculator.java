import java.util.Scanner;

class SalaryCalculator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();
        
        System.out.print("Enter HRA (House Rent Allowance) percentage: ");
        double hraPercent = scanner.nextDouble();
        
        System.out.print("Enter DA (Dearness Allowance) percentage: ");
        double daPercent = scanner.nextDouble();
        
        System.out.print("Enter Tax Deduction percentage: ");
        double taxPercent = scanner.nextDouble();
        
        double hra = (hraPercent / 100) * basicSalary;
        double da = (daPercent / 100) * basicSalary;
        double grossSalary = basicSalary + hra + da;
        double tax = (taxPercent / 100) * grossSalary;
        double netSalary = grossSalary - tax;
        
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary after Tax Deduction: " + netSalary);
        
        scanner.close();
    }
}