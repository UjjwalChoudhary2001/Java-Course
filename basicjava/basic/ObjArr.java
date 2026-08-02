package basicjava.basic;

class Student {
    String name;
    int age;
    int rollno;
}

public class ObjArr {

    public static void main(String[] a) {
        int arr[] = new int[3];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Student s1 = new Student();
        s1.name = "Rohit";
        s1.age = 20;
        s1.rollno = 1;

        Student s2 = new Student();
        s2.name = "Ronit";
        s2.age = 21;
        s2.rollno = 2;

        Student s3 = new Student();
        s3.name = "Rohan";
        s3.age = 22;
        s3.rollno = 3;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + ": " + students[i].rollno);
        }

        

    }

}
