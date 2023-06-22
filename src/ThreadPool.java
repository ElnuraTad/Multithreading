import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newScheduledThreadPool(5);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 20; i++) {
            executorService.execute(new MyThread3("A"));
            executorService.execute(new MyThread3("B"));
            executorService.execute(new MyThread3("C"));
            executorService.execute(new MyThread3("D"));
            executorService.execute(new MyThread3("E"));
        }
        executorService.shutdown();
    }
}

class MyThread3 extends Thread{
    String name;
    public MyThread3(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + name);
        }
    }
}
