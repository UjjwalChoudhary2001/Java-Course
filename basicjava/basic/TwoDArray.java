package basicjava.basic;

public class TwoDArray {
    public static void main(String a[])
    {
        int nums[][]=new int[3][4];

        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                nums[i][j]=(int)(Math.random()*10);
            }
        }

        for(int n[]:nums)
        {
            for(int m:n)
            {
                System.out.print(m+" ");
            }

            System.out.println();
        }


    }
}
