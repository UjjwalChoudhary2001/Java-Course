package basicjava.imptopics;

class Laptop{
    String model;
    int price;

    //Overriding the toString() method of Object class
    public String toString()
    {
        return model + " : " + price;
    }
    
    //Overriding the equals method of Object class
    public boolean equals(Laptop that)
    {
        if (this.model == that.model && this.price==that.price)
        {
            return true;
        }

        return false;
    }

    /*
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
    */
    
}

public class ObjClass {
    public static void main(String [] args)
    {
        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo";
        obj1.price=10;

        System.out.println(obj1);
        System.out.println(obj1.toString());

        Laptop obj2 = new Laptop();
        obj2.model = "Apple";
        obj2.price=100;

        Laptop obj3 = new Laptop();
        obj3.model = "Lenovo";
        obj3.price=10;

        System.out.println(obj1==obj2);
        
        System.out.println(obj1.equals(obj2));

        System.out.println(obj1.equals(obj3));

        //Laptop a = new Laptop();
        //Laptop b=a;
        //System.out.println(a.hashCode()==b.hashCode());
        //System.out.println(a.equals(b));

    }
}
