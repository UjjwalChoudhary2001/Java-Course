package basicjava.accessmodfrs;
import basicjava.accessmodfrs.others.*;

class C extends A{
    public void show()
    {   
        System.out.println(marks1); // Can access protected func/var of classes in diff packages after extending
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.marks);

        B obj1 = new B();
        System.out.println(obj1.marks);
    }
}
