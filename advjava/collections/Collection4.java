package advjava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    // Unimplemented Method for Comparable
    @Override
    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        }

        return -1;
    }
};

public class Collection4 {
    public static void main(String[] args) {

        Comparator<Integer> cmp = new Comparator<Integer>() {

            // Sorting on basis of last digit
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                }

                return -1;
            }
        };

        List<Integer> l = new ArrayList<>();
        l.add(43);
        l.add(31);
        l.add(72);
        l.add(29);

        // Collections.sort(l);
        Collections.sort(l, cmp);
        System.err.println(l);
        System.out.println("----------------------------------");

        /*
        Comparator<Student> c1 = new Comparator<Student>() {
            // Sorting as per age
            public int compare(Student s1, Student s2) {
                if (s1.age > s2.age) {
                    return 1;
                }

                return -1;
            }
        };
        */
        
        //Using Lambda expression bcz Comparator is a Function Interface
        
        //Comparator<Student> c1 = (Student s1, Student s2)-> s1.age > s2.age ?1:-1;
        Comparator<Student> c1 = (s1,s2)-> s1.age > s2.age ? 1:-1;
            
        

        List<Student> s = new ArrayList<>();
        s.add(new Student(21, "Navin"));
        s.add(new Student(12, "John"));
        s.add(new Student(18, "Parul"));
        s.add(new Student(20, "Kiran"));

        Collections.sort(s, c1);
        System.out.println(s);
        System.out.println("----------------------------------");
        // Using Comparable to sort instead of Comparator
        s.add(new Student(60, "Aman"));
        s.add(new Student(70, "Rahul"));
        Collections.sort(s);
        System.out.println(s);

    }
}
