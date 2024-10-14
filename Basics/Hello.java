import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        int ans = Add();
        System.out.println(ans);
    }

    static int Add() {
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sum = num1 + num2;
        return sum;
    }
    // static void hello() {
    // int num1, num2, sum;
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the no ");
    // num1 = sc.nextInt();
    // num2 = sc.nextInt();
    // sum = num1 + num2;
    // System.out.println(sum);
    // }
}
