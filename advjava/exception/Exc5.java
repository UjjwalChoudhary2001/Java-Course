package advjava.exception;
/*
class A{
    public void show()
    {
        try{
            //Class.forName("advjava.exception.Exc5");
            Class.forName("Demo"); //Prints ClassNotFound Exception
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Exception: "+e);
        }
    }
}
 */

class A{
    public void show() throws ClassNotFoundException
    {
            Class.forName("advjava.exception.Exc5");
            //Class.forName("Demo"); //Prints ClassNotFound Exception
    }
}


public class Exc5 {

    // static{
    //     System.out.println("Exc5 Loaded..");
    // }
    public static void main(String[] args) {
        
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
            System.out.println("Exception: "+e);
        }
    }
    
}
