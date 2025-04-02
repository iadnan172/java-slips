
import java.util.*;

public class integer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> t = new TreeSet<>();
        System.out.println("Enter the Number of Elements :");
        int n = sc.nextInt();

        System.out.println("Enter the Elments :");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (!t.add(num)) {
                System.out.println("Duplicate Entry not allowed :" + num);

            }
        }
        System.out.println("Elemetns In Soreted order :" + t);
    }

}
