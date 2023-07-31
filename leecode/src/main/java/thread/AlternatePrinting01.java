package thread;

/**
 * @author ：wang xiaofeng
 * @date ：Created in 2023-07-31 20:33
 * @description：
 */
public class AlternatePrinting01 {
    private static final Object lock = new Object();
    private static volatile int number = 0;
    private static final int MAX_COUNT = 10;

    public static void main(String[] args) {
        Thread t1 = new NumberPrinter(0);
        Thread t2 = new NumberPrinter(1);

        t1.start();
        t2.start();
    }

    static class NumberPrinter extends Thread {
        private int remainder;

        public NumberPrinter(int remainder) {
            this.remainder = remainder;
        }

        @Override
        public void run() {
            while (number < MAX_COUNT) {
                synchronized (lock) {
                    while (number % 2 != remainder) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName()+":"+remainder);
                    number++;
                    lock.notifyAll();
                }
            }
        }
    }
}
