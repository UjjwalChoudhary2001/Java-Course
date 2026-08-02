package advjava.others;

@FunctionalInterface
interface A {
    void show();
}

// class B implements A {

//     public void show() {
//         System.out.println("in show");
//     }
// }

public class FunctInterface {
    public static void main(String[] args) {
       // A obj = new B();
       // obj.show();

       A obj = new A() {
            public void show()
            {
              System.out.println("in show");
            }
       };

       obj.show();
    }
}
