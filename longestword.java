import java.util.*;
class Longest
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1;
int max_length=0;
String temp=" ";

s1=sc.nextLine();
s1=s1.toLowerCase();

String words[]=s1.split(" ");
//s1="AEC ACOE ACET"
//words[]={"AEC" ,"ACOE", "ACET}
for(int i=0;i<words.length;i++)
{
if(words[i].length()>max_length)
 {
   max_length=words[i].length();
   temp=words[i];
 }
}
System.out.println("longest word is"+temp);
System.out.println("length is"+max_length);
}
}


