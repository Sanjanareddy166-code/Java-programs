class Exception6
{
 public static void main(String args[])
{
 int x=10,y=5,z=0;

 try
{
 z=x/y;
}

catch(ArithmeticException ae)
{
System.out.println("y value sould be non zero element");
z=x/2;
}

finally
{
 //cleaning code
 System.out.println("finally should be executed irrespective of exception raised or not");
}

System.out.println(z);
System.out.println("task completed");
}
}