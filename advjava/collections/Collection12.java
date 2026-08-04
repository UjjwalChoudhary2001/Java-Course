package advjava.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//Lect-113 Constructor Reference
class Student{
    private String name;
    private int age;
    
    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }    

}

public class Collection12 {
    public static void main(String[] args) {
    
        List<String> names = Arrays.asList("navin", "raj", "john");
        
        //Creating Student Objects from names

        /*Way-1
        List<Student>students = new ArrayList<>();

        for(String name:names)
        {
            students.add(new Student(name));
        }

        System.out.println(students);
`       */

        /*Way-2 Using stream
        List<Student>students = names.stream()
                                .map(name->new Student(name))
                                .toList();
        
        System.out.println(students);
        */

        //Way-3 Using stream and constructor reference
        List<Student>students = names.stream()
                                .map(Student::new)
                                .toList();
        
        System.out.println(students);

        
        

    }
}
