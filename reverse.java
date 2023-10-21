//program to find sum of all digits in given string
import java.util.*;
class Reverse
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 String s1=sc.nextLine();
 int l=0,u=0,d=0,s=0,sum=0;
 for(int i=0;i<s1.length();i++)
 {
  if(Character.isAlphabetic(s1.charAt(i)))
  {
   if(Character.isUpperCase(s1.charAt(i)))
     u++;
   else
     l++;
  }
  else if(Character.isDigit(s1.charAt(i)))
 {
  d++;
  sum=sum+s1.charAt(i)-'0';
 }
 else
   s++;
}
System.out.println(u+" "+l+" " +d+ " " +s);
System.out.println("sum is"+sum);

}
}











   