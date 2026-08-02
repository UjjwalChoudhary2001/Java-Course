package advjava.others;

@FunctionalInterface
interface A{
    int show(int x);
}

class B implements A{
    
    public int show(int x)
    {
        System.out.println("Hello");
        return 0;
    }
}

public class LambdaPrac {
    public static void main(String[] args) {
        // A obj = new B();
        // obj.show();

        A obj = (x)-> x;
        
        System.out.println(obj.show(5));
    }    
}
