package advjava.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//forEach method working
public class Collection6 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 3, 2, 5, 6);
        
        //Inheriting the consumer interface in anonymous class
        //and defining the accept method.
        Consumer<Integer> consumer = new Consumer<Integer>() {
            public void accept(Integer n) {
                System.out.println(n);
            }

        };

        nums.forEach(consumer);
        System.out.println("-----------------------------------");
        //Lambda expression
        Consumer<Integer> con = (n) -> System.out.println(n);
        nums.forEach(con);

    }
}
