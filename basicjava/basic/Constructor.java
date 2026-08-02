package basicjava.basic;

class Human{
    private int age;
    private String name;

    public Human()
    {
        age=10;
        name="Navin";
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }
}
public class Constructor {
    public static void main(String []args){
        Human h = new Human();
        System.out.println(h.getName()+": "+h.getAge());
    }
}
