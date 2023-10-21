import java.util.*;
class TooYoungException extends Exception
{
 public TooYoungException()
 {
  super();
 }
 public TooYoungException(String message)
 {
 super(message);
 }
}
class TooOldException extends RuntimeException
{
 public TooOldException()
 {
  super();
 }
 public TooOldException(String message)
 {
 super(message);
 }
}
class MarriageDemo
{
 public static void main(String args[])
 {
 int age;
 Scanner sc=new Scanner(System.in);
 try
 {
 age=sc.nextInt();
 if(age<18)
    throw new TooYoungException("minimum age required for marriage is 21");
else if(age>40)
   throw new TooOldException("you are too late");
else
   System.out.println("elgible for marriage");
 }
catch(TooYoungException te)
{
System.out.println(te);
}
catch(TooOldException to)
{
System.out.println(to);
}
catch(Exception e)
{
System.out.println(e);
}
//finally is not necessary
 finally
 {
 sc.close();
 System.out.println("scanner is closed");
 }
}
}

/*output:
17
TooYoungException: minimum age required for marriage is 21
scanner is closed

41
TooOldException: you are too late
scanner is closed

25
elgible for marriage
scanner is closed*/
