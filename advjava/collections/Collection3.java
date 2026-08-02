package advjava.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Collection3 {
    public static void main(String[] args) {
        
        Map<String,Integer>mp = new HashMap<>();
        
        mp.put("a",12);
        mp.put("b",15);
        mp.put("c",16);
        mp.put("d",17);
        mp.put("a",18);
        
        System.out.println(mp);

        //using loop
        System.err.println(mp.keySet());
        System.err.println(mp.values());
        
        // Set<String>s = mp.keySet();
        // System.out.println(s);
        // Collection<Integer>c = mp.values();
        // System.out.println(c);

        for(String key : mp.keySet())
        {
            System.out.println(key+" : "+mp.get(key));
        }

    }
}
