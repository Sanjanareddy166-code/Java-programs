/*class Stringdemo
{
public static void main(String args[])
{
StringBuffer sb=new StringBuffer("T HUB"); //16+5=21
System.out.println(sb.capacity());//5
System.out.println(sb.length());
System.out.println(sb);//T HUB
sb.reverse();
System.out.println(sb);//BUH T that means it is mutable (content is changed without creating another object

StringBuffer sb1=new StringBuffer("KFC");
sb1.setCharAt(1,'T');
System.out.println(sb1); // TFC
 
StringBuffer sb2=new StringBuffer("aditya");
sb2.append("college");
System.out.println(sb2); //adityacollege

sb.insert(1,"echnical");//inserting string at index 1
System.out.println(sb);
}
}
*/



class Stringdemo
{
public static void main(String args[])
{
 String s1=new String("THUB");
 StringBuffer sb=new StringBuffer("THUB");
//System.out.println(s1==sb);  
// error incomparable types
System.out.println(s1.equals(sb)); //false
/* when an object of String is passed, the strings are compared. But when object of StringBuffer is passed references are compared because StringBuffer does not override equals method of Object class
*/
System.out.println(s1.contentEquals(sb)); //true
//compares the content
 }
}