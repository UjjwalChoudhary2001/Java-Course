package advjava.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Lect 111 Optional String
public class Collection10 {
    public static void main(String[] args) {
        List<String>names = Arrays.asList("John","Max","Maxx","Hike");

        //Stream<String>s = names.stream().filter(name->name.contains("x"));
        //s.forEach(str->System.out.print(str+" "));

        Optional<String> strings = names.stream()
                     .filter(name->name.contains("x"))
                     .findFirst();

        System.out.println(strings.orElse("Not found"));   
        
        String res = names.stream()
                     .filter(name->name.contains("z"))
                     .findFirst()
                     .orElse("Not found");

        System.out.println(res);

    }
}
