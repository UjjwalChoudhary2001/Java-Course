package advjava.others;


interface A{
    void show(); //by default its public abstract
    void config(); // by default its public abstract

    int age=10;
    String area = "Mumbai";
};

interface X{
    void run();
}

interface Y extends X{
   //void run(); inherited by default
}

class B implements A,Y{
   
    public void show()
    {
        System.out.println("Inside show");
    }

    public void config()
    {
        System.out.println("Inside cofig");
    }

    public void run()
    {
        System.out.println("running..");
    }
}


public class Interface2 {
    public static void main(String []args)
    {
        A obj;
        //obj=new A(); //error as cant create object of interface
        obj = new B();

        obj.config();
        obj.show();

        //obj.run(); //error as reference is of interface A which doesn't know run()

        X obj1 = new B();
        obj1.run();

    }
}
