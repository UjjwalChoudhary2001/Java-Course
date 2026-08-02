package basicjava.basic;

class Human{
    String name;
    int age;

    Human(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public Human(String name) {
        this.name=name;
        age=5;
    }

    
}


public class ParamzConstructor {
    public static void main(String []args)
    {
        Human h1=new Human("John",25);
        Human h2=new Human("Alice");

        System.out.println(h1.name+" "+h1.age);
        System.out.println(h2.name+" "+h2.age);
    }
}
