public class Overloading {
    public static void main(String[] args) {
        fun(5);
        fun("Harshita");
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }
}
