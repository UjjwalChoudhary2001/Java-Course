package basicjava.basic;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Navin");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Reddy");
        System.out.println(sb);

        sb.append("----------------------------Java");
        //New capacity = (old capacity * 2) + 2 as soon as the length of the string exceeds the capacity
        System.out.println(sb.capacity());
    }
}
