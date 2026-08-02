package advjava.others;

interface A{
    void show(); //by default its public abstract
    void config(); // by default its public abstract

    int age=10;
    String area = "Mumbai";
};

class B implements A{
   
    public void show()
    {
        System.out.println("Inside show");
    }

    public void config()
    {
        System.out.println("Inside cofig");
    }
}

public class Interface1 {
    public static void main(String []args)
    {
        A obj;
        //obj=new A(); //error as cant create object of interface
        obj = new B();

        obj.config();
        obj.show();

        //A.age=12;// error as its final
        System.out.println(A.area);
    }
}
