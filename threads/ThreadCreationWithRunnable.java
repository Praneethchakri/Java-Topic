package threads;

public class ThreadCreationWithRunnable implements  Runnable{

    @Override
    public void run() {
        System.out.println("Thread Started running.. Calling Run MEthod");
    }

    public static void main(String[] args)throws Exception {

        ThreadCreationWithRunnable tr = new ThreadCreationWithRunnable();
        Thread t1 = new Thread(tr);
        t1.start();
    }
}
