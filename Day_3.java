import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
       
        condition(N);
        
    }
         public static void condition(int a)
    {   
        if(a%2==0)
        {
            if(a>=2 && a<5)
            System.out.println("Not Weird");
            else if(a>=6 && a<=20)
            System.out.println("Weird");
            else
            System.out.println("Not Weird");
        }
        else
        System.out.println("Weird");
    }
}

