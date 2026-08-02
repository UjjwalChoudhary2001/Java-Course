package basicjava.basic;

class Mobile{
    String brand;
    String price;
    static String name; //common for all objects of class

    public void show()
    {
        System.out.println(name+" : "+brand+" : "+price);
    }

    public static void show1(Mobile obj)
    {
        System.out.println(obj.brand+" : "+obj.price+" : "+name); //Gives Error because static method cannot access non static variable
    }
}
public class StaticMeth {
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

        Mobile.show1(m1);
        Mobile.show1(m2);

    }
}
