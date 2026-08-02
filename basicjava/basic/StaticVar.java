package basicjava.basic;
class Mobile{
    String brand;
    String price;
    static String name; //common for all objects of class

    public void show()
    {
        System.out.println(name+" : "+brand+" : "+price);
    }
}
public class StaticVar {
    public static void main(String [] args)
    {
        Mobile m1 = new Mobile();
        //m1.name="Smartphone"; Gives Warning
        Mobile.name="Smartphone";
        m1.brand="apple";
        m1.price="1500";

        Mobile m2 = new Mobile();
        //m2.name="Smartphone"; Gives Warning
        Mobile.name="iPhone";
        m2.brand="motorola";
        m2.price="1000";
        m1.show();
        m2.show();
    }
}
