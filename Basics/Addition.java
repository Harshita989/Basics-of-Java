package Functions.Methods;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        sum();
    }

    static void sum() {
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println(sum);
    }
}
