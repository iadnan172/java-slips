public class slip8 extends Thread{
    int n;
    String msg;
    slip8(int n, String msg)
    {
        this.n=n;
        this.msg=msg;
    }

    public void run(){
        try {
            for(int i=1; i<=n; i++){
                System.out.println(msg);
            }
        } catch (Exception e)
         {
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        slip8 t1=new slip8(10,"Covid-19");
        t1.start();
        slip8 t2=new slip8(20,"Vaccination");
        t2.start();
        slip8 t3=new slip8(30,"LockDown202");
        t3.start();
        
    }
}