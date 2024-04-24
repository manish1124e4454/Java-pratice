
import java.util.Scanner;

public class element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 integers");

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number" + (i + 1) + "");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("The enetered numbers are");

        for (int number : numbers) {
            System.out.println(number);
        }
        scanner.close();
    }
}
