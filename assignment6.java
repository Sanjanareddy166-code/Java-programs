import java.util.*;
class InvalidLoginDetailsException extends Exception
{
 public InvalidLoginDetailsException()
 {
  super();
 }
 public InvalidLoginDetailsException(String msg)
 {
  super(msg);
 }
}
class assignmnent6
{
 public static void main(String args[])
{
String username,password;
System.out.println("enter username and password");
Scanner sc=new Scanner(System.in);
try
{
username=sc.next();
password=sc.next();

if(username=="admin" && password=="thub@123")
{
 System.out.println("you are logged in");
}
else
 throw new InvalidLoginDetailsException("enter valid login details");
}

catch(InvalidLoginDetailsException ild)
{
 System.out.println(ild);
}
catch(Exception e)
{
System.out.println(e);
}

finally
{
sc.close();
System.out.println("scanner is closed");
}

}
}
