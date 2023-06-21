public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!" + Thread.currentThread().getName());
//        print();

        MyThread myThread = new MyThread();
        myThread.start();

        MyThread myThread2 = new MyThread();
        myThread2.start();
    }

    public static void print(){
        System.out.println("Ok I print");
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
//        super.run();
        System.out.println("Hello from thread" +   Thread.currentThread().getName());
    }
}