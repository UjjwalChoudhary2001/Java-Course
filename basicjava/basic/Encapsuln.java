package basicjava.basic;

class Human{
    private int age=5;
    private String name="Binod";

    public void setAge(int a)
    {
        age=a;
    }

    public void setName(String n)
    {
        name=n;
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

public class Encapsuln {
    public static void main(String []args)
    {
        Human h = new Human();

        h.setName("Vinod");
        h.setAge(23);
        System.out.println(h.getName());
        System.out.println(h.getAge());
    }
}
