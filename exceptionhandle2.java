/*class Exception 9
{
 public static void main(String args[])
 {
 int x,y,z=0;
 try
 {
 x=Integer.parseInt(args[0]);
 y=Integer.parseInt(args[1]);
 z=x/y;
 }
 catch(Exception e) 
 {
  System.out.println("input is invalid");
  }
 System.out.println(z);
 System.out.println("completed");
 }
}*/
 //all type of exceptions are catched and same output will be displayed
 //so try with multicatch came into existence







class Exception 9
{
 public static void main(String args[])
 {
 int x,y,z=0;
 try
 {
 x=Integer.parseInt(args[0]);
 y=Integer.parseInt(args[1]);
 z=x/y;
 }
 catch(ArithmeticException ae)
 {
   System.out.println("input should be numbers");
 }
  catch(Exception e) 
 {
  System.out.println("input is invalid");
  }
 System.out.println(z);
 System.out.println("completed");
 }
}
 










