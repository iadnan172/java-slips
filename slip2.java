import java.util.*;
public class slip2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<String> h=new HashSet<>();
        System.out.println("Enter The Number Of Friends :");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            h.add(sc.nextLine().trim());

        }
        TreeSet<String> t=new TreeSet<>(h);
        System.out.println("\nFriends Name in Accending Order :");
        for(String name : t)
        {
            System.out.println(name);


        }
        sc.close();
    }
}
