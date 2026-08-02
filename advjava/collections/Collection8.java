package advjava.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

//Working of filter , map and sorted functions of Stream Interface.
public class Collection8 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        //filter()
        /*
        Predicate<Integer> p = new Predicate<Integer>() {

            @Override
            public boolean test(Integer n) {

                if (n % 2 == 0) {
                    return true;
                }

                return false;
            }
        };
        */

        //Lambda Expression
        Predicate<Integer>p = n -> n%2==0;
            
        
        int res = nums.stream()
                .filter(p)
                .map(n -> n * 2)
                .reduce(0, (a, b) -> a + b);

        System.out.println(res);
        System.out.println("-------------------------------");
        
        //map()

        /*
        Function<Integer,Integer>fun = new Function<Integer,Integer>(){
            public Integer apply(Integer n)
            {
                return n*2;
            }
        };
        */
        
        Function<Integer,Integer>fun = n -> n*2;

                res = nums.stream()
                .filter(p)
                .map(fun)
                .reduce(0, (a, b) -> a + b);

        System.out.println(res);
        System.out.println("-------------------------------");

        //Sorting Using Stream
        Stream<Integer>s = nums.stream().filter(n->n%2==0).map(n->n*2).sorted();

        s.forEach(val->System.out.print(val+" "));
        System.out.println("\n"+"-------------------------------");


    }
}
