import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main3 {
    public static void main(String[] args) throws InterruptedException {

        MyThread2 myThread2 = new MyThread2();


        Thread t1 = new Thread( myThread2);
        t1.start();
        Thread t2 = new Thread(myThread2);
        t2.start();
        Thread.sleep(1000);

        System.out.println(myThread2.getX());

    }
}

class MyThread2 extends Thread{
    Lock lock = new ReentrantLock();
    int x = 0;
    public  void run() {
        for (int i = 0; i < 100; i++)
            x++;
        lock.unlock();
        }


        public int getX(){
            return x;

    }
}
