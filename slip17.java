import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class slip17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new TreeSet<>(); // TreeSet stores elements in sorted order and removes duplicates

        System.out.print("Enter the number of integers (N): ");
        int N = scanner.nextInt();

        System.out.println("Enter " + N + " integers:");
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (!numbers.add(num)) {
                System.out.println("Duplicate entry ignored: " + num);
            }
        }

        System.out.println("\nSorted Unique Numbers: " + numbers);

        scanner.close();
    }
}
 
