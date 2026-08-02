package advjava.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Collection7 {
    public static void main(String[] args) {
        List<Integer>nums = Arrays.asList(4,5,7,3,2,6);
        Stream<Integer>s = nums.stream();

        s.forEach(ele->System.out.print(ele +" "));   
        //Below line gives exception as stream is not reusable     
        //s.forEach(ele->System.out.println(2*ele));     

        System.out.println("\n"+"-------------------------------");
        //Methods in Stream Interface
        Stream<Integer>s1 = nums.stream();
        Stream<Integer>s2=s1.filter(n->n%2==0);
        Stream<Integer>s3=s2.map(n->n*2);
        int res = s3.reduce(0, (a,b)->a+b);
 
        System.out.print(res);

        System.out.println("\n"+"-------------------------------");

        res = nums.stream()
              .filter(n->n%2==0)
              .map(n->n*2)
              .reduce(0,(a,b)->a+b);

        System.out.print(res);


    }
}
