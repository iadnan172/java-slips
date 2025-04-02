import java.util.*;

public class slip21 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedList<String> l=new LinkedList<>();
        System.out.println("Enter the Number of Subjects :");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the Subjects"+(i+1)+":");
            l.add(sc.nextLine());

        }
        System.out.println("\nEnterd Subjects Are :");
        Iterator <String> it=l.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        sc.close();

    }
}