package advjava.threads;

class Counter {

    int counter;
    //Using synchronized to prevent race condition
    public synchronized void  increment() {
        counter++;
    }
}

public class Threads4 {

    public static void main(String[] args) {
        
        Counter c = new Counter();

        Runnable obj1 = () -> {

            for (int i = 0; i < 10000; i++) {
                c.increment();
            }
        };

        Runnable obj2 = () -> {

            for (int i = 0; i < 10000; i++) {
                c.increment();
            }

        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        //Using join to wait for both threads to finish else main prints counter
        //before the threads finsish execution and prints 0 or any random no.
        //as output
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(c.counter);
    }
}
