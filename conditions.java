import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class conditions {
    public static void main(String[] args)  
    {
        Scanner scanner = new Scanner(System.in);
        
        int i = scanner.nextInt();
        
        if (i % 2 == 0  )
        {
            if (i >=2 && i<=5)
            {
                System.out.println("Not Weird");
            }
            
            else if (i>=6 && i<=20)
            {
                System.out.println("Weird");
            }
            else if (i > 20)
            {
                System.out.println("Not Weird");
            }
        }
        
        else 
        {
            System.out.println("Weird");
        }
        
        scanner.close();
    }
}
