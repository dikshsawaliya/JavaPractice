import java.io.*;
import java.util.Scanner;


public class sumarray
{
    public static void main (String[]args) 
    {
        int n;
        int sum = 0;

        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        int a[] = new int [n];

        System.out.println("Enter the all the elements: ");

        for (int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
            sum = sum + a[i];

        }

        System.out.println("Sum: " + sum);
    }

}