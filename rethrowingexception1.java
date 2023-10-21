//RETHROWING EXCEPTION:


class Nestedtry
{
 public static void main(String args[])
 {
  int x[]={10,20,40};
  try
  {
    System.out.println(x[2]);
    try
    {
      int z=10/0;
    }
    catch(ArithmeticException ae)
    {
     System.out.println("invalid division");
     System.out.println("handling ArithmeticException -1");
     throw ae;
     }
    System.out.println("inner try close");
  }

   catch(ArrayIndexOutOfBoundsException aoe)
   {
    System.out.println("index out of range");
   }
   
   catch(ArithmeticException a)
   {
    System.out.println("handling Arithmetic Exception -2");
   }

    catch(Exception e)
    {
     System.out.println(" outer tryblock catch statement");
    }
   System.out.println("outer tryblock close");
}
}