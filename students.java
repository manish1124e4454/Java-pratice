import java.util.Scanner;

public class students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUM_STUDENTS = 8;

        int[] studentid = new int[NUM_STUDENTS];
        String[] studentName = new String[NUM_STUDENTS];
        double[] studentMark = new double[NUM_STUDENTS];

        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.println("Enter the details for student" + (i + 1));
            System.out.print("Student ID");
            studentid[i] = scanner.nextInt();
            scanner.nextLine();

            System.err.print("Enter student name");
            studentName[i] = scanner.nextLine();
            System.out.print("ENter student mark");
            studentMark[i] = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Student details");

            for (int j = 0; j < NUM_STUDENTS; j++) {
                System.out.println("Student" + (i + 1));
                System.out.println("ID" + studentid[i]);
                System.out.println("Name" + studentName[i]);
                System.out.println("Mark" + studentMark[i]);
                System.out.println();
            }
        }
    }
}
