class OperatorsDemo {
    public static void main(String[] args) {

        int a = 10, b = 3;

        // 1. Arithmetic Operators
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // 2. Relational Operators
        System.out.println("\n=== Relational Operators ===");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // 3. Logical Operators
        System.out.println("\n=== Logical Operators ===");
        System.out.println("(a > 5 && b < 5): " + (a > 5 && b < 5));
        System.out.println("(a > 5 || b > 5): " + (a > 5 || b > 5));
        System.out.println("!(a > b): " + !(a > b));

        // 4. Assignment Operators
        System.out.println("\n=== Assignment Operators ===");
        int x = 5;
        x += 2; // x = x + 2
        System.out.println("x += 2: " + x);
        x *= 3; // x = x * 3
        System.out.println("x *= 3: " + x);

        // 5. Unary Operators
        System.out.println("\n=== Unary Operators ===");
        int y = 5;
        System.out.println("y: " + y);
        System.out.println("++y: " + (++y)); // pre-increment
        System.out.println("y++: " + (y++)); // post-increment
        System.out.println("y after increment: " + y);
        System.out.println("--y: " + (--y)); // pre-decrement

        // 6. Ternary Operator
        System.out.println("\n=== Ternary Operator ===");
        int age = 18;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Result: " + result);
    }
}