package advjava.others;

//Note: The enums which we create cant be extended by other classes else
// we get error if try to extend them by other classes.

enum Status { //extends java.lang.Enum
    Running, Failed, Pending, Success
}

enum Laptop{ //extends java.lang.Enum
Macbook(200),Surface(400),Thinkpad(100),Zbook;

private int price;

private Laptop(int price) {
    this.price = price;
    System.out.println("Inside Prmtzed Constr for "+this.name());
}


private Laptop() {
    price=20;
    System.out.println("Inside Default Constr for "+this.name());
}

public int getPrice(){
    return price;
}

public void setPrice(int price)
{
    this.price=price;
}

}


public class Enum3 {
    public static void main(String[] args) {
        Status s = Status.Pending;
        //Enums get the functions from Enum class of java
        System.out.println(s.getClass().getSuperclass()); //class java.lang.Enum

        // Laptop l = Laptop.Macbook;
        // System.out.println(l+":"+l.getPrice());

        for(Laptop lap: Laptop.values())
        {
            System.out.println(lap+" : "+lap.getPrice());
        }
        
    }
}
