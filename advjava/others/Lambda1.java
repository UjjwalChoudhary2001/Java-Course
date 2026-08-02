package advjava.others;

@FunctionalInterface
interface A {
    void show();
}

@FunctionalInterface
interface B{
    void run(int i);
}

public class Lambda1 {
    public static void main(String[] args) {
        // A obj = new A(){
        // public void show()
        // {
        // System.out.println("in show");
        // }
        // };

        A obj = () -> {
            System.out.println("in show");
        };

        obj.show();

        //B obj2 = (int i) -> System.out.println("running "+i);
        B obj2 = (i) -> System.out.println("running "+i);
        obj2.run(0);

    }
}
