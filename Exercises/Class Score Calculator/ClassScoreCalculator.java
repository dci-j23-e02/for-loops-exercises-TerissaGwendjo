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

            scores[i] = score; //assigns the value of the variable score to the i-th element in the scores array.
            totalScore += score; //adds the value of the score to the totalScore variable.
        }

        if (totalScore > 0) {
            double average = (double) totalScore / numStudents;
            System.out.println("Average score of the class: " + average);

            // Bonus: Calculate median and mode
            Arrays.sort(scores); //is used to sort the elements in an array called scores. When this line is executed,
            // the elements in the scores array are rearranged in ascending order (from the smallest to the largest).
            // so the smallest score will be at scores[0], and the largest score will be at the last position, scores[scores.length - 1].
            double median; // The median is the middle value in a set of data when the data is arranged in ascending
            // order. If there is an even number of data points, the median is the average of the two middle values.
            if (numStudents % 2 == 0) {
                median = (double) (scores[numStudents / 2 - 1] + scores[numStudents / 2]) / 2.0; //see notes below
            } else {
                median = (double) scores[numStudents / 2]; //directly accesses the middle value in the sorted array of
                // scores. This is the median for odd-sized datasets.
            }
            System.out.println("Median score of the class: " + median);

            int mode = calculateMode(scores); //calculateMode method explained below
            System.out.println("Mode score of the class: " + mode);
        } else {
            System.out.println("No valid scores were entered.");
        }

        scanner.close();

        /*numStudents / 2 calculates the index of the middle element (the right one). For example, if there are
        6 students, numStudents / 2 would be 3, and scores[3] is the right-middle element.
numStudents / 2 - 1 calculates the index of the element to the left of the middle. In the example, this would be
scores[2], the left-middle element.
The code adds these two middle values together, calculating the sum of the middle values.
The sum of the two middle values is then divided by 2 to obtain the average. This average is the median for datasets
with an even number of elements.
The result is cast to a double to ensure that the median is calculated as a floating-point value. This is done to
handle fractional values when averaging the two middle values.*/
    }

    // Bonus: Method to calculate the mode
    public static int calculateMode(int[] scores) {
        int mode = scores[0];
        int maxCount = 1;

        int current = scores[0];
        int currentCount = 1;

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] == current) {
                currentCount++; // currentcount is incremented by 1
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount; //maxCount is updated with the value of currentCount.
                    mode = current; // and mode variable also updated with current number, indicating new mode.
                }

                current = scores[i];
                currentCount = 1;
            }
        }

        return (currentCount > maxCount) ? current : mode;
        //The condition (currentCount > maxCount) is evaluated.
        //If the condition is true, the expression returns the value before the ?, which is current.
        //If the condition is false, the expression returns the value after the ?, which is mode.
    }
    /*int mode = scores[0];: Initialize the mode variable with the first element of the scores array. This assumes that
    the first element is the mode initially.

int maxCount = 1;: Initialize a variable called maxCount to 1. This variable will keep track of the maximum frequency
(count) of a number in the dataset. It starts at 1 because any number in the dataset appears at least once.

int current = scores[0];: Initialize the current variable with the first element of the scores array. This variable
represents the current number being counted.

int currentCount = 1;: Initialize a variable called currentCount to 1. This variable will keep track of the count of
the current number.

The method then enters a loop that iterates through the scores array starting from the second element (index 1) because
 the first element has already been used for initialization.

Inside the loop:

If the current element (scores[i]) is equal to the current number, it means the same number is encountered again.
In this case, currentCount is incremented by 1.
If the current element is different from the current number, it means a new number is encountered. In this case,
the code checks if currentCount is greater than maxCount. If it is, maxCount is updated with the value of currentCount,
and the mode variable is updated with the current number, indicating a new mode.
After the loop completes, the mode variable contains the mode of the dataset.

The System.out.println("Mode score of the class: " + mode); line then prints the mode score to the console.*/
}

