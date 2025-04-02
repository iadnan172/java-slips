import java.util.*;
public class slip6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeSet<Integer> t=new TreeSet<>();
        System.out.println("Enter The Number OF Elements :");
        int n=sc.nextInt();

        System.out.println("Enter "+ n + " Integers :");
        for(int i=0; i<n; i++)
        {
            t.add(sc.nextInt());

        }
        System.out.println("Soreted Unique Number is :"+t);
        //search
        System.out.println("Enter the number to be searched :");
        int num=sc.nextInt();
        if(t.contains(num)){
            System.out.println("Number Is Present :");
        }
        else{
            System.out.println("Number Is Not Present :");
        }
        sc.close();
    }
    
}
