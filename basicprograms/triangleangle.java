import java.util.*;
class Triangle
{
 public static void main(String args[])
{
 Scanner sc=new Scanner (System.in);
 int a,b,c;
 a=sc.nextInt();
 b=sc.nextInt();
 c=sc.nextInt();
 if(a+b>c && a+c>b && b+c>a)
 {
  System.out.println("triangle is valid");
 }
 else
 {
  System.out.println("triangle is not valid");
 }
}
}
 