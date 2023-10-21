import java.util.*;
public class sample
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int low=sc.nextInt();
        int high= sc.nextInt();
        for (int n = low; n <= high; n++) 
        {
          boolean isprime=true;
          for (int i = 2; i < n; i++)
           {
                if (n % i == 0) 
                {
                    isprime=false;
                    break;
                }
            }
            if (isprime && n>2) 
                System.out.print(n+" ");
        }
    }
}