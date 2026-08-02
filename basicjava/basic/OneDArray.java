package basicjava.basic;

public class OneDArray {

    public static void main(String[]a) {
        int arr[] = { 1, 2, 3, 4 };
        arr[0] = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int arr2[] = new int [2];
        arr2[0]=1;
        arr2[1]=2;
        System.out.println("Elements of arr2:");
       
        for(int x:arr2)
        {
            System.out.println(x);
        }
    }

}
