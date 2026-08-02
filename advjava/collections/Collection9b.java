package advjava.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Parallel Stream b (Lect 110)
public class Collection9b {
    public static void main(String[] args) {
        int size = 10_000;

        List<Integer> nums = new ArrayList<>(size);
        Random ran = new Random();

        for (int i = 0; i < size; i++) {
            nums.add(ran.nextInt(100));
        }

        long startSeqStream = System.currentTimeMillis();

        int sum2 = nums.stream()
                .map(i -> {

                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                        System.out.println("Exception: " + e);
                    }

                    return i * 2;
                })
                .mapToInt(i -> i) // converting stream to int type
                .sum(); // returns int

        long endSeqStream = System.currentTimeMillis();

        System.out.println("Sum2: " + sum2);

        long startParallelStream = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                .map(i -> {

                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                        System.out.println("Exception: " + e);
                    }

                    return i * 2;
                })
                .mapToInt(i -> i) // converting stream to int type
                .sum(); // returns int

        long endParallelStream = System.currentTimeMillis();

        System.out.println("Sum3: " + sum3);

        System.out.println("Seq Stream: " +
                (endSeqStream - startSeqStream));

        System.out.println("Parallel Stream: " +
                (endParallelStream - startParallelStream));

    }
}
