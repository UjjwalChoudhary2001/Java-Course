package basicjava.basic;

public class Literal {
    int num=0b111;
    int num2=0x12A;
    float num3=10.5e2f;
    int num4=1_000_000;

    public static void main(String[] args) {
        Literal l = new Literal();
        System.out.println(l.num);
        System.out.println(l.num2);
        System.out.println(l.num3);
        System.out.println(l.num4);

        // int res = 123%2==0 ? 1 : 0;

        // System.out.println(res);
    }

}
