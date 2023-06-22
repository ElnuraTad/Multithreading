public class Main {
    public static void main(String[] args) throws InterruptedException {

        //System.out.println("Hello world!" + Thread.currentThread().getName());
//        print();

        MyThread2 myThread = new MyThread2();// new

        Thread t1 = new Thread(myThread);
        t1.start();
        Thread.sleep(1000);
        Thread t2 = new Thread(myThread);
        t2.start(); //ready

        Thread.sleep(1000);
        System.out.println(myThread.getX());

//        Thread.sleep(1000);
       // myThread.join();



//        MyThreadRunnable r1 = new MyThreadRunnable();
//        Thread t3 = new Thread(r1);
//        t3.start();
//
//        System.out.println("Main thread is dead");


    }

    public static void print(){
        System.out.println("Ok I print");
    }
}

class MyThread extends Thread{
    int x = 0;
    @Override
    public  synchronized void run() { //running
        for (int i = 0; i < 1000; i++) {
            //System.out.println(i + "" +   Thread.currentThread().getName());
//            Thread.yield();
            int temp = x; // temp = 0
            temp++; //temp = 1
            Thread.yield();
            x = temp; // x = 1
        }
    }

    public int getX(){
        return x;
    }
}

class MyThreadRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + "" + Thread.currentThread().getName());
        }
    }
}