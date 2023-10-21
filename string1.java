/*class String1
{
 public static void main(String args[])
 {
  String s1="acet"; //stored in string constant pool
  String s2="acet";
  String s3=new String("acet"); //stored in heap
  String s4=new String("acet");
  System.out.println(s1==s2); //true
  System.out.println(s1==s3);//false
  System.out.println(s1.equals(s3)); //true
  System.out.println(s3==s4); //false
 }
}*/

/*note: in strings if want to compare 
==  =>it compares the address of the objects
equals  =>compares the content not address*/


//Imutability:

/*class String2
{
 public static void main(String args[])
 {
 String s1="aditya";
 System.out.println("before concat"+s1);
 s1.concat("engineering");
 System.out.println("after concat"+s1);
 }
}

output:
aditya
aditya

class String2
{
 public static void main(String args[])
 {
 String s1="aditya";
 System.out.println("before concat"+s1);
 s1=s1.concat("engineering");
 System.out.println("after concat"+s1);
 }
}
output:
aditya
aditya engineering*/


//STRING METHODS

/*import java.util.*;
class String1
{
public static void main(String args[])
{
//Scanner sc=new Scanner(System.in);
//String S1=sc.nextLine();

String S1="Aditya engineering";

System.out.println(S1.length());
System.out.println(S1.isEmpty());
System.out.println(S1.toLowerCase());
System.out.println(S1.toUpperCase());
System.out.println(S1);
System.out.println(S1.concat("college"));
System.out.println(S1.indexOf(('A')));
System.out.println(S1.lastIndexOf(('A')));
System.out.println(S1.charAt(3));
System.out.println(S1.equals("Aditya Engineering"));
System.out.println(S1.equalsIgnoreCase("Aditya Engineering"));
System.out.println(S1.substring(7));
System.out.println(S1.substring(7,18));
System.out.println(S1.contains("aditya"));
System.out.println(S1.contains("Aditya"));
 }
}
*/


/*class Aditya
{
public static void main(String args[])
{
 //Scanner sc=new Scanner(System.in);
 //String s1=sc.nextLinr(); //"Aditya engineering"
String s1="Aditya engineering";
//output:no of words in given string
char ch[]=s1.toCharArray();
int count=0;
for(int i=0;i<ch.length;i++)
{
  if(ch[i]==' ')
    count++;
}
System.out.println(count+1);


String words[]=s1.split(" "); //split based on space
//Aditya engineering => ["Aditya","engineering"]
System.out.println(words.length);
 }
}*/


//reverse of words
class Reverse
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in)
   String s1;
   s1=sc.nextLine();
   String words[]=s1.split(" ");
   for(int j=0;j<words.length;j++)
   {






















 
 