package advjava.others;

class A {

    int age;

    public void show() {
        System.out.println("In show");
    }

    class B {

        public void config() {
            System.out.println("In config");
        }
    }

    static class C{
        public void display()
        {
            System.out.println("Inside display");
        }
    }
}

public class InnClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        // B obj1 = new B(); gives error

        A.B obj1 = obj.new B(); //for non-static classes
        obj1.config();

        A.C obj2 = new A.C(); //for static classes
        obj2.display();
    }
}
