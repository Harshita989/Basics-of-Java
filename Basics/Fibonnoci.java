import java.util.Scanner;

public class Fibonnoci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, c, i;
        System.out.println(a);
        System.out.println(b);
        for (i = 2; i <= n; i++) {
            c = a + b;
            System.out.println("" + c);
            a = b;
            b = c;
        }
    }
}