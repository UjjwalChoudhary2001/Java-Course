package advjava.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Using finally to close resources
public class Exc8 {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = null;
        int num=0;
        try{
              InputStreamReader in = new InputStreamReader(System.in);
              bf = new BufferedReader(in);
              System.out.println("Enter Number");
              num = Integer.parseInt(bf.readLine());
        }
        finally{
            System.out.println("Inside Finally");
            bf.close();
        }
    }
}
