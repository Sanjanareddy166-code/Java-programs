//program to find the array is sorted or not (ascending order) printing output on method

import java.util.*;
class Sorted
{
public static boolean sorted(int arr[],int size)
{
  for(int i=1;i<size;i++)
 {
  if(arr[i]<arr[i-1])
    return false; //if array is not sorted(11 22 33 55 44)
 }
 return true;//if array is sorted(11 22 33 44 55)
}
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int n,x[],i,res;
 n=sc.nextInt();
 x=new int[n];
  for(i=0;i<n;i++)
    x[i]=sc.nextInt();
 System.out.println(sorted(x,n));
 }
}