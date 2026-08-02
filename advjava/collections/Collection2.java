package advjava.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Collection2 {
    public static void main(String[] args) {
        Set<Integer>s = new HashSet<Integer>();
        boolean ifexist = s.add(1);
        System.out.println(ifexist);
        ifexist = s.add(1);
        System.out.println(ifexist);
        s.add(11);
        s.add(21);
        s.add(3);
        System.out.println(s);
    
        Set<Integer>t = new TreeSet<Integer>();
        t.add(1);
        t.add(1);
        t.add(11);
        t.add(21);
        t.add(3);

        if(t.contains(1))
        {
            System.out.println("Element present...");
            t.remove(1);
            t.add(1);
        }

        System.out.println(t);

        //Using Iterable Class
        Collection<Integer>c = new TreeSet<Integer>();
        c.add(5);
        c.add(4);
        c.add(3);

        Iterator<Integer>values=c.iterator();
        while(values.hasNext())
        {
            System.out.println(values.next());
        }
    
    }        

}
