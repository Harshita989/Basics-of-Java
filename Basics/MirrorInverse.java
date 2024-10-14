import java.util.Scanner;

public class MirrorInverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Check if the array is mirror-inverse
        if (isMirrorInverse(arr)) {
            System.out.println("The array is a mirror-inverse.");
        } else {
            System.out.println("The array is not a mirror-inverse.");
        }
    }

    // Function to check if an array is mirror-inverse
    public static boolean isMirrorInverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Check if arr[arr[i]] equals i
            if (arr[arr[i]] != i) {
                return false; // If any element doesn't satisfy the condition, return false
            }
        }
        return true; // If all elements satisfy the condition, return true
    }
}
