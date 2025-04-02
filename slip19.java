import java.util.LinkedList;
import java.util.Scanner;

public class slip19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a LinkedList to store integers
        LinkedList<Integer> numbers = new LinkedList<>();

        // Accept number of integers (N)
        System.out.print("Enter the number of integers (N): ");
        int N = scanner.nextInt();

        // Accept N integers from user
        System.out.println("Enter " + N + " integers:");
        for (int i = 0; i < N; i++) {
            numbers.add(scanner.nextInt());
        }

        // Display only negative integers
        System.out.println("\nNegative Integers:");
        for (int num : numbers) {
            if (num < 0) {
                System.out.println(num);
            }
        }

        scanner.close();
    }
}
