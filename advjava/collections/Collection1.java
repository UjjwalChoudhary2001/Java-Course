package advjava.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collection1 {
    public static void main(String args[])
    {   
        //Not a good way as we can add a string also in below arraylist
        //and the operation n*2 will cause exception (runtime error)
        //Incase we define type of arraylist we get compiletime error which 
        //is better.

        Collection nums = new ArrayList();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        //nums.add("5");
        System.out.println(nums);

        for(Object obj :nums)
        {
            int n = (Integer)obj;
            System.out.println(n*2);
        }

        System.out.println("---------------------------");
        Collection<Integer> c = new ArrayList<Integer>();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        //nums.add("5");
        System.out.println(c);

        for(int x : c)
        {
            System.out.println(x);
        }

        System.out.println("---------------------------");
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(3);
        System.out.println(l.get(0));
        System.out.println(l.indexOf(3));
        System.out.println(l.lastIndexOf(3));

    }
}
