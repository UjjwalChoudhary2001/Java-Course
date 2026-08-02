package advjava.threads;

class A extends Thread{
    
    public void run() //every thread class must have run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    
    public void run() //every thread class must have run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class Threads2 {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();

        try {
            Thread.sleep(5); //May cause a differece of 5 ms to prevent both threads reach to scheduler at same time.
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        obj2.start();
    }
}
