package basicjava.inheritance;

class Computer{
    
    public void show()
    {
        System.out.println("In Computer Show");
    }
}

class Laptop extends Computer{

    public void show()
    {
        System.out.println("In Laptop Show");
    }
}

//Which function is called depends on the type of object created and that too on
//run time so dynamic method dispatch is run time polymorphism.
public class DynMethDisp {
    public static void main(String[] args) {
        Computer obj = new Laptop(); // Laptop IS-A Computer
        obj.show();

        obj = new Computer();
        obj.show();

    }
}
