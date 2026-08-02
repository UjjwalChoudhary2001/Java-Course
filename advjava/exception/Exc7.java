package advjava.exception;

//Concept of finally block which executes irrespective of exception comes or not.
public class Exc7 {
    
    public static void main(String[] args) {
        
        int i=0;
        int j=18;
        
        try{
              j=j/i;
        }
        catch(Exception e)
        {
            System.out.println("Exception: "+e);
        }
        finally{
            System.out.println("Inside Finally");
        }
    }
}
