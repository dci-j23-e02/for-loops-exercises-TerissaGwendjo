import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in percentage): ");
        double rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        if (rate < 0) {
            System.out.println("Interest rate cannot be negative. Exiting.");
            scanner.close();
            return;
        }

        // Calculate compound interest
        double totalAmount = principal;
        for (int i = 1; i <= years; i++) {
            totalAmount += totalAmount * rate;
        }

        System.out.printf("Total amount after %d years: %.2f%n", years, totalAmount);

        // Bonus: Calculate simple interest
        double simpleInterest = principal * rate * years;
        System.out.printf("Simple interest after %d years: %.2f%n", years, simpleInterest);

        scanner.close();
    }
}
