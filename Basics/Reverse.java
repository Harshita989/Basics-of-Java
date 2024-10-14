import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNum = num; // Store the original number for comparison

        int rem;
        int ans = 0;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;

            ans = ans * 10 + rem;

        }
        if (ans == originalNum) {
            System.out.println("no is palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }
}
