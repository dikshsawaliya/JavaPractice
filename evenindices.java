import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        scanner.nextLine();
        
        for(int i=0; i<T; i++)
        {
            String str = scanner.nextLine();
            String even = "";
            String odd = "";


            for (int j=0; j < str.length(); j++)
            {
                if(j%2==0)
                {
                    even += str.charAt(j);
                }
                else
                {
                    odd += str.charAt(j);
                }
            }
                    System.out.print(even + " " + odd);
                    System.out.println();
        }
            
    } 
}
