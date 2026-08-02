package advjava.others;

@FunctionalInterface
interface A{
    int add(int i,int j);
}

public class Lambda2 {
    public static void main(String[] args) {
        // A obj = new A(){
        //     public int add(int a ,int b)
        //     {
        //         return a+b;
        //     }
        // };


        // A obj = (a,b)->
        // {
        //     return a+b;
        // } ;
           
        A obj = (a,b) -> a+b;
        
        int res = obj.add(1, 3);
        System.out.println("result: "+res);
    }
}
