
import java.util.Random;

 class demo extends Thread {
    private String name;

    public demo(String name){
        this.name=name;

    }
    public void run(){
        try{
            Random rand=new Random();
            int sleeptime =rand.nextInt(5000);
            System.out.println("Thread" + name +"Is Running");
            System.out.println("Thread" + name +"Is going to sleep for " + sleeptime + "ms");
            Thread.sleep(sleeptime);
            System.out.println("Thread" + name +"Is awake");
        }catch (InterruptedException e){
            System.out.println("Thread" + name + "was interrupted ");

        }
    }
}
public class slip13{
    public static void main(String[] args){
        System.out.println("Main Thread Started");

        demo t1=new demo("Alpha");
        demo t2=new demo("Beta");
        demo t3=new demo("gamma");

        t1.start();
        t2.start();
        t3.start();
        System.out.println("Main Thread is finished execution :");

    }
    
}