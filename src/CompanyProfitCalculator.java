import java.util.Scanner;

class Company {
    private String name;
    private double revenue;
    private double expenses;

    // Constructor
    public Company(String name, double revenue, double expenses) {
        this.name = name;
        this.revenue = revenue;
        this.expenses = expenses;
    }

    // Method to calculate profit
    public double calculateProfit() {
        return revenue - expenses;
    }

    // Method to display company information
    public void displayInfo() {
        System.out.println("Company Name: " + name);
        System.out.println("Revenue: $" + revenue);
        System.out.println("Expenses: $" + expenses);
        System.out.println("Profit: $" + calculateProfit());
    }
}

public class CompanyProfitCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input company information
        System.out.print("Enter company name: ");
        String name = scanner.nextLine();

        System.out.print("Enter total revenue: $");
        double revenue = scanner.nextDouble();

        System.out.print("Enter total expenses: $");
        double expenses = scanner.nextDouble();

        // Create a Company object
        Company company = new Company(name, revenue, expenses);

        // Display company information
        company.displayInfo();

        scanner.close();
    }
}