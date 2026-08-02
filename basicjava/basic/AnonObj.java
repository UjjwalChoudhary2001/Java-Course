package basicjava.basic;

class A{
    public A()
    {
        System.out.println("Inside A");
    }

    public void show()
    {
        System.out.println("Inside show");
    }
}

public class AnonObj {
    public static void main(String []args)
    {   
        //A obj; reference variable
        //obj = new A(); object creation
        new A(); // We dont have the address od object in a reference variable.
        new A().show();
    }
}
