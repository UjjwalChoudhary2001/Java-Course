package advjava.exception;

public class Exc1 {
    public static void main(String[] args) {
        int i=0;
        int j=2;

        try{
            j=18/i;
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong..");
        }

        System.out.println("i: "+i+" j: "+j);
    }
}
