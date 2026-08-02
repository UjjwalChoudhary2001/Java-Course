package advjava.exception;

//Custom Exception
class CustomException extends Exception{

    public CustomException(String string) {
        super(string);
    }

}

public class Exc4 {
    public static void main(String[]args)
    {
        int i=20;
        int j=18;
        
        try{
            j=j/i;

            if(j==0)
            //throw new CustomException();
            throw new CustomException("Dont want j as zero..");
        }
        catch(Exception e)
        {
            System.out.println("Default Msg: "+e);
        }
    }    
}
