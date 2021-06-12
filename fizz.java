import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class fizz {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) 
    {
    // Write your code here
    Scanner scanner = new Scanner(System.in);
    
    int i = scanner.nextInt();
    
    if(i % 3 == 0 && i % 5 == 0)
    {
        System.out.println("Fizzbuzz");
        
        
        if(i % 3 == 0)
    {
        System.out.println("Fizz");
    }
        else if (i % 5 == 0)
    {
        System.out.println("Buzz");
    }
        else 
    {
        System.out.println(i);
    }
    }
    scanner.close();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}
