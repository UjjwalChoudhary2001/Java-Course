package advjava.collections;

import java.util.Arrays;
import java.util.List;

//Lect-112 Method Reference
public class Collection11 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("navin", "raj", "john");

        //Converting the list into uppercase
        List<String> modifiedNames = names.stream()
                .map(str -> str.toUpperCase())
                .toList();

        System.out.println(modifiedNames);

        //Method Reference 
        modifiedNames = names.stream()
                        .map(String::toLowerCase) //toLowerCase func belongs to String class
                        .toList();
        
        modifiedNames.forEach(System.out::println);
    }
}
