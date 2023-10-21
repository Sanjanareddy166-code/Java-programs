import java.util.*;
class Type
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int a,b,c;
 a=sc.nextInt();
 b=sc.nextInt();
 c=sc.nextInt();
 if(a==b && b==c &&c==a)
 {
 System.out.println("triangle is equilateral");
 }
  else if(a==b ||b==c || c==a)
 {
  System.out.println("triangle is  isoceles");
 }
 //if(a!=b && b!=c && c!=a)
 else
 {
  System.out.println("triangle is scalence");
 
 }
}
}
 