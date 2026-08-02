package advjava.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Try with resources: The connection automatically closes
//So no need to use finally incase we have a single resource to be closed
//In case of multiple resources to be closed we will have to used finally.
public class Exc9 {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        int num=0;
        try(BufferedReader bf = new 
            BufferedReader(new InputStreamReader(System.in))){
              System.out.println("Enter Number");
              num = Integer.parseInt(bf.readLine());
        }

    }
}
