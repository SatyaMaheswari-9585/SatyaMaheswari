package array_Programmes;
import java.util.Scanner;

class Calculator {

    public double operate(double a, double b, String op) {
        switch (op.toLowerCase()) {
            case "add": return a + b;
            case "sub": return a - b;
            case "mul": return a * b;
            case "div":
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                    return Double.NaN;
                }
                return a / b;
            default:
                System.out.println("Invalid operation");
                return 0;
        }
    }
}

public class Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add/sub/mul/div): ");
        String op = sc.next();

        Calculator calc = new Calculator();
        System.out.println("Result: " + calc.operate(a, b, op));
    }
}

