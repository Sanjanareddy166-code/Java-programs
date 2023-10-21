import java.util.*;
class Array
{
 public static void display(int arr[],int size)
 {
  for(int i=0;i<size;i++)
     System.out.println(arr[i]+" ");
 }
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int n,x[],i;
 n=sc.nextInt();
 x=new int[n];
 for(i=0;i<n;i++)
   x[i]=sc.nextInt();

 /*method 1 for(i=0;i<n;i++)
   System.out.println(x[i]+" "); array input,printing are done in main method*/
  
  display(x,n);
 }
}

