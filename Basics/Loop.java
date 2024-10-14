import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);

        }

    }
}
