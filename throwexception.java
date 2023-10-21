/*import java.util.*;
class Exception8
{
 public  static int division(int x,int y)
{
int z=x/y;
/*if we give y as 0 exception is raised then 
we can use try and catch to handle 
return z;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int m,n;
m=sc.nextInt();
n=sc.nextInt();
System.out.println(division(m,n));
}
}*/


//HANDLING EXCEPTION USING TRY CATCH
/*import java.util.*;
class Exception8
{
 public  static int division(int x,int y)
{ 
  int z=0;
   try
  {
   z=x/y;
  }
catch(ArithmeticException ae)
{
  System.out.println("y should be non zero");
}
return z;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int m,n;
m=sc.nextInt();
n=sc.nextInt();
System.out.println(division(m,n));
}
}*/


//HANDLING USING THROWS
/* if developer is not interested to handle exception using try catch and wanted to throw the exception to the method which it is called then main method will handle if it also not handled default handle will happen*/
 
/*import java.util.*;
class Exception8
{
public static int division(int x,int y) throws ArithmeticException
{
 int z=0;
 z=x/y;
 return z;
}
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int m,n,result=0;
 m=sc.nextInt();
 n=sc.nextInt();
 try
 {
  result=division(m,n);
 }
 catch(ArithmeticException ae)
 {
  System.out.println("y shouldnot be zero");
 }
 
 System.out.println(result);
 System.out.println("Task completed");
}
}*/
/*output:
25
0
y shouldnot be zero
0
Task completed*/


//IF EXCEPTION IS THROWED AND MAIN METHOD DONOT HANDLE IT THEN DEFAULT HANDLE WILL HAPPEN

import java.util.*;
class Exception8
{
public static int division(int x,int y) throws ArithmeticException
{
 int z=0;
 z=x/y;
 return z;
}
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int m,n;
 m=sc.nextInt();
 n=sc.nextInt();
 System.out.println(division(m,n));
 System.out.println("Task completed");
}
}

/*output:
25
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Exception8.division(throwexception.java:97)
        at Exception8.main(throwexception.java:106)*/
