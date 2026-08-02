package basicjava.basic;


class Phone{
    String brand;
    String price;
    static String name; //common for all objects of class

    public void show()
    {
        System.out.println(name+" : "+brand+" : "+price);
    }

    public Phone()
    {   
        System.out.println("Inside Constructor");
        brand="apple";
        price="100";
        //name="smartphone"; (not recommended)leads to setting of name to smartphone for all objects of class Phone
    }

    static{
        System.out.println("Inside Static Block");
        name="smartphone"; //static block is only executed once when the class is loaded in memory and it is used to initialize static variables of class
    }
}


public class StaticBlk {
     public static void main(String [] args) throws ClassNotFoundException
    {
        /*
        Phone m1 = new Phone();
        //m1.name="Smartphone"; Gives Warning
        Phone.name="Smartphone";
        m1.brand="apple";
        m1.price="1500";

        Phone m2 = new Phone();
        //m2.name="Smartphone"; Gives Warning
        Phone.name="iPhone";
        m2.brand="motorola";
        m2.price="1000";
        */
        Class.forName("basicjava.Phone");

    }
}
