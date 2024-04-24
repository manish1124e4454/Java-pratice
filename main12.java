import day7.Book;
import java.util.Scanner;

public class main12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book[] books = new Book[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the details of book " + (i + 1));
            System.out.println("Enter the book ID");
            int bookId = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.println("Enter the book name");
            String bookName = scanner.nextLine();
            System.out.println("Enter the price");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            books[i] = new Book(bookId, bookName, price);
        }

        for (Book book : books) {
            System.out.println("Book Id: " + book.getBookId());
            System.out.println("Book Name: " + book.getBookName());
            System.out.println("Price: " + book.getPrice());
            System.out.println();
        }

        scanner.close(); // Closing the scanner
    }
}
