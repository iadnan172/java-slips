



public class slip18 extends Thread {
    
    private String text;

    public slip18(String text)
    {
        this.text = text;
    }

    public void run() {
        for (char c : text.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                System.out.println(c);
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args)
    {
        new slip18("Multi Threading Example ").start();
        
    }
}

