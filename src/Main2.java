public class Main2 {
    public static void main(String[] args) {

        String a = "ABC";
        String b = "DEF";

        Thread t1 = new Thread(){
            @Override
            public void run() {
                synchronized (a){
                    System.out.println("A is synchronized from thread 1 ");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    synchronized (b){
                        System.out.println("B is synchronized from thread 2 ");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                synchronized (b){
                    System.out.println("A is synchronized from thread 1 ");

                    synchronized (a){
                        System.out.println("B is synchronized from thread 2 ");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
