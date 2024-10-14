import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char n = sc.next().trim().charAt(0);
        if (n > 'a' && n < 'z') {
            System.out.println("charater is in Smallcase");
        }

        else {
            System.out.println("Character is in Upeercase");
        }
    }
}
