public class main2 {
    public static void main(String[] args) {
        int[] numbers = { 2, 3, 4, 5 };

        try {
            int elements = numbers[6];
            System.out.println("Element at index 5");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error" + e.getMessage());
            System.out.println("Array index is out of boundary");
        }
    }
}
