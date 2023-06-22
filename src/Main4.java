import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main4 {
     static Account account = new Account();

    public static void main(String[] args) {

        Thread t1 = new Thread(new MyDeposit());
        Thread t2 = new Thread(new MyWithdraw());
        t1.start();
        t2.start();

    }


    static class   MyDeposit extends Thread{
        @Override
        public void run() {
            try {
                Main4.account.deposit(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

 static class   MyWithdraw extends Thread{
    @Override
    public void run() {
        try {
            account.withdrow(800);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

   static class Account{
        int balance = 0;

        public synchronized void deposit(int amount) throws InterruptedException {
            Thread.sleep(1000);
            balance += amount;
            notifyAll();
            System.out.println("Balance is increased" + balance);
        }

        public synchronized void withdrow(int amount) throws InterruptedException {
            while (amount > balance){
                wait();
            }

            System.out.println("Balance befpre withdraw" + balance);
            balance -= amount;
            System.out.println("Balance after withdraw" + balance);
        }
    }
}
