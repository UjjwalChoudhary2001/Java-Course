package basicjava.inheritance;
class Calc{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
}

class AdvCalc extends Calc{
    public int add(int n1,int n2)
    {
        return n1+n2+1;
    }
}
public class MethdOverdng {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        System.out.println(obj.add(1, 2));
    }
}
