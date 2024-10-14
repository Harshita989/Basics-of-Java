import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.println("Enter the Operator");
            char opr = sc.next().trim().charAt(0);
            if (opr == '+' || opr == '-' || opr == '*' || opr == '/' || opr == '%') {
                System.out.println("ENter no a");
                int a = sc.nextInt();
                System.out.println("ENter no b");

                int b = sc.nextInt();
                if (opr == '+') {
                    ans = a + b;

                }
                if (opr == '-') {
                    ans = a - b;

                }
                if (opr == '*') {
                    ans = a * b;

                }
                if (opr == '/') {
                    if (b != 0) {
                        ans = a + b;

                    }

                }
                if (opr == '%') {
                    if (b != 0) {
                        ans = a % b;

                    }

                } else if (opr == 'x' || opr == 'X') {
                    break;

                }
            } else {
                System.out.println("Invalid Operation");
            }
            System.out.println(ans);

        }

    }
}
