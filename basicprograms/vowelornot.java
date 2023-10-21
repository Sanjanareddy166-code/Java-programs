/*import java.util.*;
class Vowelornot
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  char ch;
  ch=sc.nextLine().charAt(0);
  ch=Character.toLowerCase(ch);
  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
     System.out.println(ch+"vowel");
  else
      System.out.println(ch+"consonant");
  }
}
*/
//using switch case


/*import java.util.*;
class Vowelornot
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  char ch;
  ch=sc.nextLine().charAt(0);
  ch=Character.toLowerCase(ch);
  switch(ch)
  {
   case 'a':
          System.out.println(ch+"is a vowel");
          break;
   case 'e':
          System.out.println(ch+"is a vowel");
          break;
   case 'i':
          System.out.println(ch+"is a vowel");
          break;
   case 'o':
          System.out.println(ch+"is a vowel");
          break;
   case 'u':
          System.out.println(ch+"is a vowel");
          break;
    default:
         System.out.println(ch+"is a consonant");
  }
sc.close();
}
}*/

 //ANOTHER WAY 
import java.util.*;
class Vowelornot
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  char ch;
  ch=sc.nextLine().charAt(0);
  ch=Character.toLowerCase(ch);
  switch(ch)
  {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
       System.out.println(ch+"is a vowel");
       break;
   default:
      System.out.println(ch+"is a consonant");
}
sc.close();
}
}

