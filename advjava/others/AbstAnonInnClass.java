package advjava.others;

abstract class A {
    public abstract void show();
}

/*
 * Not useful to create B if we need to call show() only once.
 * class B extends A{
 * 
 * public void show()
 * {
 * System.out.println("Inside show");
 * }
 * 
 * }
 */

public class AbstAnonInnClass {
    public static void main(String[] args) {

        // A obj = new A(); // Gives error as we cant create obj of abstract class
        
        
        A obj = new A() {  //Here, obj is not object of A but of Anon Inner class

            public void show() {
                System.out.println("Inside show");
            }
        };

        obj.show();

    }
}
