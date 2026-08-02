package basicjava.imptopics;

class A{
    public void show1()
    {
        System.out.println("In A show");
    }
}

class B extends A{
    public void show2()
    {
        System.out.println("In B show");
    }
}

public class Casting {
    public static void main(String[] args) {
        // double d = 5.6;
        // int i = (int)d;

        // System.out.println(i);

        // A obj = new A();
        // obj.show1();

        A obj = new B(); // same as A obj = (A) new B(); (Upcasting)
        obj.show1();
        // obj.show2(); //Gives error as reference is of A

        B obj1 = (B)obj; //Downcasting
        obj1.show2(); 
    }
}
