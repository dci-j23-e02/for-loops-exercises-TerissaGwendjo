import java.util.Scanner;
import java.util.Arrays;

public class ClassScoreCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        if (numStudents <= 0) {
            System.out.println("Please enter a valid number of students.");
            return;
        }

        int[] scores = new int[numStudents];
        int totalScore = 0;

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the score for student " + (i + 1) + ": ");
            int score = scanner.nextInt();

            if (score < 0) {
                System.out.println("Negative score is invalid. Exiting.");
                break;
            }

            scores[i] = score;
            totalScore += score;
        }

        if (totalScore > 0) {
            double average = (double) totalScore / numStudents;
            System.out.println("Average score of the class: " + average);

            // Bonus: Calculate median and mode
            Arrays.sort(scores);
            double median;
            if (numStudents % 2 == 0) {
                median = (double) (scores[numStudents / 2 - 1] + scores[numStudents / 2]) / 2.0;
            } else {
                median = (double) scores[numStudents / 2];
            }
            System.out.println("Median score of the class: " + median);

            int mode = calculateMode(scores);
            System.out.println("Mode score of the class: " + mode);
        } else {
            System.out.println("No valid scores were entered.");
        }

        scanner.close();
    }

    // Bonus: Method to calculate the mode
    public static int calculateMode(int[] scores) {
        int mode = scores[0];
        int maxCount = 1;

        int current = scores[0];
        int currentCount = 1;

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] == current) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    mode = current;
                }

                current = scores[i];
                currentCount = 1;
            }
        }

        return (currentCount > maxCount) ? current : mode;
    }
}

