public class ThredingByExtending extends Thread {

    public void run() {
        System.out.println("Inside run method");
    }

    public static void main(String[] args) {
        ThredingByExtending thread = new ThredingByExtending();
        thread.start();
        System.out.println("main method");
    }
}