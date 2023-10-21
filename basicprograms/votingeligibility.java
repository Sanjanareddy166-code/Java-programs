import java.util.*;
class Voting
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int age;
   System.out.println("enter age");
   age=sc.nextInt();
   if(age>=18)
     System.out.println("eligible for voting");
   else
     System.out.println("not eligible for voting");
  }
}