package advjava.threads;

class Cntr {
    int cnt = 0;

    public synchronized void inc() {
        cnt++;
    }
}

public class PracThread {
    public static void main(String[] args) throws Throwable {
        Cntr c = new Cntr();

        Runnable obj1 = new Runnable() {

            public void run() {
                for (int i = 0; i < 10000; i++)
                    c.inc();
            }

        };

        Runnable obj2 = new Runnable() {

            public void run() {
                for (int i = 0; i < 10000; i++)
                    c.inc();
            }

        };

        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.cnt);
    }
}
