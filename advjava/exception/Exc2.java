package advjava.exception;

//Multiple Catch Blocks
public class Exc2 {
    public static void main(String[] args) {
        int i=0;
        int j=10;

        int nums[] = new int[5];
        String s = null;
        try{
            //j=j/i;
            //nums[5]=10;
            int len = s.length();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cant divide by zero..");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in Array Limits.");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong "+e);
        }

        System.out.println("Bye..");

    }
}
