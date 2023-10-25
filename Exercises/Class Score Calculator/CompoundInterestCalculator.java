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
            //It then calculates compound interest by looping through each year and applying the interest rate.
            // The result is stored in the totalAmount variable. It's updating the totalAmount by including the
            // interest for the current period.  In this case, it means that we're updating the totalAmount variable
            // by adding the value on the right side.
            // This is the essence of compound interest - earning interest on the interest already earned.
            //For example, let's say the initial totalAmount is $1000, and the rate is 5% (0.05 as a decimal).
            // After the first iteration, the interest earned in that period would be 1000 * 0.05 = $50,
            // and the totalAmount would be updated to 1000 + 50 = $1050
            /*In subsequent iterations, the same logic is applied, but now you're earning interest on the new totalAmount.
            So, for the second period, you'd calculate the interest as 1050 * 0.05 = $52.50, and the totalAmount would
            be updated to 1050 + 52.50 = $1102.50, and so on. This code effectively implements the calculation of compound
            interest over multiple periods, where the interest earned in each period contributes to the principal for the next period*/
        }

        System.out.printf("Total amount after %d years: %.2f%n", years, totalAmount);
        //The program prints the total amount after the specified number of years using System.out.printf to format
        // the output with two decimal places.

        // Bonus: Calculate simple interest
        double simpleInterest = principal * rate * years;
        System.out.printf("Simple interest after %d years: %.2f%n", years, simpleInterest);

        scanner.close();
    }
}
