package advjava.exception;

class MyException extends Exception{
    
    MyException(String msg)
    {
        super(msg);
    }
}

public class Pract {
    public static void main(String[] args) {
        int j=0;
        try{
            if(j==0)
            {
                throw new MyException("My msg");
            }
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
    }    
}
