public class ThreadAlive extends Thread{
    public static int a = 0;
    public static void main(String[] args) {
        ThreadAlive thread = new ThreadAlive();
        thread.start();

        while(thread.isAlive())
            System.out.println("waiting..");

        System.out.println(a);
        a++;
        System.out.println(a);
    }

    public void run() {
        for(int i=0;i<5;i++)
            a++;
    }
}
