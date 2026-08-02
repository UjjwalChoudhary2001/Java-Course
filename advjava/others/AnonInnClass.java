package advjava.others;

class A {
    public void show() {
        System.out.println("In A show");
    }
}

// Creating B is not useful if we just to call show once
class B extends A {
    public void show() {
        System.out.println("In B show");
    }
}

public class AnonInnClass {
    public static void main(String[] args) {
        // A obj = new A();
        // obj.show();

        // A obj = new B();
        // obj.show();

        A obj = new A() {

            public void show() {
                System.out.println("Inside new show");
            }

        };

        obj.show();
    }
}
