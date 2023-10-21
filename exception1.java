//EXCPTION RAISING EXAMPLES:

/*class Exception1
{
public static void main(String args[])
{
int x=10,y=0,z;
z=x/y;
System.out.println(x+" "+y);
System.out.println(z); //exception will be raised
}
}*/

/*class Exception2
{
public static void main(String args[])
{
 int x[]={10,20,30,40};
 for(int i=0;i<=x.length;i++)
   System.out.println(x[i]); //array index out of bound
 System.out.println("task completed");
}
}*/


/*class Exception3
{
public static void main(String args[])
{
 String name="aditya";
 System.out.println(name.charAt(10)); //string index out of bound exception
 System.out.println("task completed");
}
}*/
  
/*NumberFormatException(when we give string as input in command line arguments string canno be changed to int so exception raised*/

class Exception4
{
public static void main(String args[])
{
 int age=Integer.parseInt(args[0]);
 System.out.println("your age="+age);
 System.out.println("task completed");
}
}