class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double numbers
    public double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling the method with two int parameters
        System.out.println("Sum of two integers: " + calc.add(10, 20)); // Output: 30

        // Calling the method with three int parameters
        System.out.println("Sum of three integers: " + calc.add(10, 20, 30)); // Output: 60

        // Calling the method with two double parameters
        System.out.println("Sum of two doubles: " + calc.add(10.5, 20.3)); // Output: 30.8
    }
}
