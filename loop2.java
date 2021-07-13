import java.util.Scanner;

public class loop2 {
     public static void main(String[] args) {
        
                Scanner in = new Scanner(System.in);
                System.out.println("Enter Number of queries: ");
                int t=in.nextInt();

                for(int i=0;i<t;i++){
                    System.out.println("Enter a: ");
                    int a = in.nextInt();
                    System.out.println("Enter b: ");
                    int b = in.nextInt();
                    System.out.println("Enter n: ");
                    int n = in.nextInt();
                    
                    for(int j=0; j>n; j++)
                    {
                        a += (int)Math.pow(2,j) *b;
                        System.out.println(a+ " ");
                    }
                    System.out.println(" ");
                    
                }
                in.close();
            }
     }
