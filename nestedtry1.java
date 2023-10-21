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
     
    }
    System.out.println("inner try close");
  }
   /*catch(Exception e)
    {
     System.out.println(" outer tryblock catch statement");
    }
 we should write at last only*/

   catch(ArrayIndexOutOfBoundsException aoe)
   {
    System.out.println("index out of range");
   }

    catch(Exception e)
    {
     System.out.println(" outer tryblock catch statement");
    }
   System.out.println("outer tryblock close");
}
}







