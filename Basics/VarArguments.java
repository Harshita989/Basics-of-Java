import java.util.Arrays;

public class VarArguments {
    public static void main(String[] args) {
        fun(2, 4, 5, 6, 7, 8);
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
