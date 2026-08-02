package advjava.collections;

import java.util.Arrays;
import java.util.List;

public class Collection5 {
    public static void main(String[] args) {
        List<Integer>l = Arrays.asList(4,3,2,6,5);

        int sum=0;

        for(int n:l)
        {
            if(n%2==0)
            {   
                n*=2;
                sum+=n;
            }
        }
        System.out.println("Sum: "+sum);

        //Ways to Print List

        //1. for loop

        for(int i=0;i<l.size();i++)
        {
            System.out.println(l.get(i));
        }

        System.out.println("------------------------------");
        //2. enhanced for loop

        for(int n:l)
        {
            System.out.println(n);
        }
        
        System.out.println("------------------------------");
        //3. forEach()
        l.forEach(val->System.out.println(val));

        
    }
}
