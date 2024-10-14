import java.util.Scanner;

public class Greatestno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers 1");
        int a = sc.nextInt();
        System.out.println("Enter the numbers 2");

        int b = sc.nextInt();
        System.out.println("Enter the numbers 3");

        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println(a + "is greatest");
        } else if (b > a && b > c) {
            System.out.println(b + "is greatest");
        } else {
            System.out.println(c + "is greatest");
        }
    }

}
