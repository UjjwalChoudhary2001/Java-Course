package advjava.exception;

//Throw Keyword
public class Exc3 {

    public static void main(String[] args) {
        int i=20;
        int j=18;
        
        try{
            j=j/i;

            if(j==0)
            { //Throwing exception at a particular condition..
             throw new ArithmeticException("This is my message");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Default O/P: "+e);
        }

        System.out.println("j: "+j);
    }
}
