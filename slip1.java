public class slip1 extends Thread {
   public static void main(String[] args){
        Thread  t= new Thread(new slip1());
        t.start();
   }
   public void run(){
    try {
        for(char ch = 'A'; ch<= 'Z'; ch++)
        {
            System.out.println(ch);
            sleep(2000);
        }
    } catch (Exception e) {
        System.out.println(e);
    }
   }

    
}
