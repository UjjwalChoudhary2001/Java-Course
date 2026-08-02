package advjava.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exc6 {
    public static void main(String[] args) throws IOException {
        
        System.out.println("Enter the number..");
        /* 
        int num = System.in.read();
        //printing the entered number..
        System.out.println(num-48); //48 is ascii of 0
        */

        //New Way
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The number is: " + num);

        //Taking input in older way..
        System.out.println("Old Way-Enter the number..");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int number = Integer.parseInt(bf.readLine());
        System.out.println("The number is.. "+number);
        
    }
}
