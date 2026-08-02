package basicjava.inheritance;

// final class A{

// }


// class B extends A{ //2.error as class A is final

// }

class C{
    // public final void show()
    // {

    // }
}



class D extends C{

    public void show() //3. error as show is final function in class C
    {

    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        
        final int a = 10;
        System.out.println(a);
        // 1. a=9; error.
        
        
    }
}
