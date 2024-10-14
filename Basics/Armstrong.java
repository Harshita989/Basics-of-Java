import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num; // Store the original number for comparison
        int rem;
        int sum = 0;

        // Calculate the sum of the cubes of each digit
        while (num > 0) {
            rem = num % 10; // Get the last digit
            sum = sum + (rem * rem * rem); // Add the cube of the digit to the sum
            num = num / 10; // Remove the last digit
        }

        // Check if the sum of cubes equals the original number
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
