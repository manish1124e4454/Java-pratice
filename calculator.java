import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the 2nd number");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the operator (+,-,*,/)");
        char operator = scanner.next().charAt(0);

        double result = 0;

        try {
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed");
                    }
                    result = num1 / num2;
                    break;

                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }
            System.out.println("Result" + result);
        } catch (ArithmeticException e) {
            System.out.println("Error" + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error" + e.getMessage());
        } finally {
            scanner.close();
        }

    }
}
