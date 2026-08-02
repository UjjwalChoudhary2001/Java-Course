package basicjava.inheritance;

public class Demo {
    public static void main(String []args)
    {   
        System.out.println("Inside main of Demo");
        //Calc c = new Calc();
        //AdvCalc c = new AdvCalc();
        VeryAdvCalc c = new VeryAdvCalc();
        int res1 = c.add(10,20);
        int res2=c.sub(10,5);
        int res3=c.mult(1,2);
        int res4=c.div(3,4);
        double res5 = c.power(5, 2);
        System.out.println(res1+" "+res2+" "+res3+" "+res4+" "+res5);
    }
}
