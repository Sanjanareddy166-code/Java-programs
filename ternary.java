import java.util.*;
class Ternary
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int age;
   //String result;declaration
   age=sc.nextInt();
  String result=age>=18?"you are eligible for voting":"you are not eligible for voting";
  System.out.println(result);
 }
}