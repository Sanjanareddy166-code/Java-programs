//index of first occurence in a string
//indexOf method
//lastIndexof = starts checking from last
import java.util.*;
class Firstoccur
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1,s2;
s1=sc.nextLine();
s2=sc.nextLine();
int result=s1.indexOf(s2);
System.out.println(result);
}
}
