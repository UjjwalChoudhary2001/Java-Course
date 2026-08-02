package basicjava.basic;
class Calculator{

    int num=10;
    int add(int n1,int n2){
        return n1+n2;
    }

    double add(int a ,double b)
    {
        return a+b;
    }

    int add(int a,int b,int c)
    {
        return a+b+c;
    }

}
public class OverLoading {
    public static void main(String []args)
    {
        Calculator calc=new Calculator();
        System.out.println(calc.add(1,2)); 
        System.out.println(calc.add(1,2.6)); 
        System.out.println(calc.add(1,2,6)); 

        System.out.println(calc.num);
        Calculator calc1 = new Calculator();
        calc1.num=23;
        System.out.println(calc1.num);
    }
}
