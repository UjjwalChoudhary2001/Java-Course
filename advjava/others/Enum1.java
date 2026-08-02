package advjava.others;

enum Status{
    Running,Failed,Pending,Success;
}

public class Enum1 {
    public static void main(String[] args) {
        Status s = Status.Pending; //s is reference to enum object Status.Pending
        System.out.println(s); //Pending
        System.out.println(s.ordinal()); //2

        Status [] allStatus = Status.values();

        for(Status obj : allStatus)
        {
            System.out.println(obj + ":"+obj.ordinal());
        }
    }
}
