// Create LinkedList
// Add Elements at the End
// Delete First Element
// Display in Reverse Order Contents

import java.util.*;
public class slip3 {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
        // Add Elements at the End
        System.out.println("Enter the Number of Names:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline character
        System.out.println("Enter the Names:");
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine(); // Read a new name in each iteration
            l.add(name);
        }

        // Display List
        System.out.println("LinkedList Content: " + l);

        // Delete First Element
        if (!l.isEmpty()) {
            System.out.println("Removed First Element: " + l.removeFirst());
        }

        // Reverse Order
        System.out.println("LinkedList Content in Reverse Order:");
        ListIterator<String> iterator = l.listIterator(l.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        sc.close();
    }
}