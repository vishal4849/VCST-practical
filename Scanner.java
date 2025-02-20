import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        // Create a scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variable to store the sum
        int sum = 0;

        // For loop to calculate the sum from 1 to the number
        for (int i = 1; i <= number; i++) {
            sum += i;  // Add the current number to the sum
        }

        // Print the result
        System.out.println("The sum of numbers from 1 to " + number + " is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
