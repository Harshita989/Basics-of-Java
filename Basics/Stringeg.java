import java.util.*;

public class Stringeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();

        String ans = string(name);
        System.out.println(ans);
    }

    static String string(String name) {
        String n = "Hello " + name;
        return n;

    }
}
