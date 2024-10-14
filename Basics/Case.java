import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();
        switch (fruit) {
            case "mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("Apple");
                break;
            case "Banana":
                System.out.println("banana");

            default:
                System.out.println("Fruitss");
                break;
        }
    }
}
