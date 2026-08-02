package basicjava.basic;

class Calculator {
    int add(int n1,int n2){
        return n1+n2;
    }
}

public class Demo{
    int d1=1,d2=120;
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int res=c.add(1,2);
        System.out.println(res);

        Demo d = new Demo();
        System.out.println(d.d1);
    }
}