package threads;

public class ThreadCreationWithThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread-1 Started");
    }

    public static void main(String[] args) {
        ThreadCreationWithThread t= new ThreadCreationWithThread();
        t.start();
    }
}
