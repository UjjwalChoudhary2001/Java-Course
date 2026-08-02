package advjava.others;

// class Laptop{
//     public void code()
//     {
//         System.out.println("code,compile and run");
//     }
// }

//The developer can only create apps using laptop which is wrong as if 
//a desktop is given he wont be able to create apps so we need loose coupling
//and flexibility. Thus we create a class Computer
// class Developer{
//     public void devApp(Laptop lap)
//     {
//         lap.code();
//     }
// }


//So now developer is not dependent on laptop but on computer which can be a laptop
//or a desktop.
//We can also make Computer class as abstract class or create an interface called Computer
//In case we create Interface computer we need to use implements keyword and not
//extends to inherit it in the Laptop and Desktop classes.
class Computer{
    public void code()
    {

    }
}

// abstract class Computer{
//     public abstract void code();
// }

// interface Computer{
//     void code();
// }

class Laptop extends Computer{
    public void code()
    {
        System.out.println("code,compile and run");
    }
}

class Desktop extends Computer{
    public void code()
    {
        System.out.println("code,compile and run : Faster");
    }
}

class Developer{
    public void devApp(Computer c)
    {
        c.code();
    }
}

public class Interface3 {
    public static void main(String[] args) {
        // Developer d = new Developer();
        // Laptop l = new Laptop();
        // d.devApp(l);

        Computer laptop = new Laptop();
        Developer d1 = new Developer();
        d1.devApp(laptop);

        Computer desktop = new Desktop();
        d1.devApp(desktop);

    }
}
