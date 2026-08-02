package basicjava.imptopics;

public class Wrapper {
    public static void main(String []args)
    {   
        Integer num1 = 8;
        Integer num2 = new Integer(num1); //boxing (conversion of Primitive to Object)
        Integer num3 = num1; //auto-boxing 
        System.out.println(num2);
        System.out.println(num3);

        System.out.println(num2.intValue()); //unboxing (conversion of Object into Primitive)
        System.out.println(num2); //auto-unboxing

        String val="12";
        System.out.println(Integer.parseInt(val));
    }
}
