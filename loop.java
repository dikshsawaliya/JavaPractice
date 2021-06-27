import java.io.*;
import java.util.*;



public class loop {
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        for ( int i = 1; i <= 10; i++)
        {
        System.out.println(N  +  " x "   +i+   " = "   + N*i);
        }
        scanner.close();
    }
    
}
