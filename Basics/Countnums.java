import java.util.Scanner;

public class Countnums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == 1)
                count++;
            num = num / 10;
        }
        System.out.println(count);

    }
}
