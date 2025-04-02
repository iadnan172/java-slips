public class slip15 extends Thread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Thread Name :" + t.getName());
        System.out.println("Thread Priority " +t.getPriority());


    }
}
