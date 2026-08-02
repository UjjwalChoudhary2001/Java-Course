package basicjava.basic;

class Humans{
private int age=5;
    private String name="Binod";

    public void setAge(int age)
    {
        //age=age;
        this.age=age;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    // public void setName(String name,Humans obj)
    // {
    //     Humans obj1=obj;
    //     obj1.name=name;
    // }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }
}


public class ThisKeyword {
    public static void main(String []args)
    {
        Humans h = new Humans();
        //h.setName("Vinod", h);
        h.setName("Vinod");
        h.setAge(23);
        System.out.println(h.getName());
        System.out.println(h.getAge());
    }
}
