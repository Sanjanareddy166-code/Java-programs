/* 5 subject marks find average and total
exceptions- giving negative marks(negative val exception)
            max is 100 so outofrange exception*/


import java.util.*;
class NegativeMarksException extends Exception
{
 public NegativeMarksException()
 {
  super();
 }
 public NegativeMarksException(String message)
 {
  super(message);
 }
}
class OutOfRangeException extends RuntimeException
{
 public OutOfRangeException()
 {
  super();
 }
 public OutOfRangeException(String message)
 {
 super(message);
 }
}
class Average
{
 public static void main(String args[])
 {
 int m1,m2,m3,m4,m5,total;
 float average;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter marks");

 try
 {
 m1=sc.nextInt();
 m2=sc.nextInt();
 m3=sc.nextInt();
 m4=sc.nextInt();
 m5=sc.nextInt();
 if(m1<0 || m2<0 || m3<0 ||m4<0 ||m5<0)
    throw new NegativeMarksException("marks should not be negative");
 if(m1>100 || m2>100 || m3>100 ||m4>100 ||m5>100)
   throw new OutOfRangeException("marks cannot be greater than 100");
 else
   total=m1+m2+m3+m4+m5;
   average=total/5;
   System.out.println("total is"+total);
   System.out.println("average is"+average);
 }

catch(NegativeMarksException nm)
{
System.out.println(nm);
}

catch(OutOfRangeException of)
{
System.out.println(of);
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

***********

class Average
{
 public static void main(String args[])
 {
  int marks[],i,n,sum=0;
  float average;
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  marks[]=new int[n];
  try
  {
   for(i=0;i<n;i++)
   {
      marks[i]=sc.nextInt();
      if(marks[i]<0)
          throw new NegativeMarksException("marks should be negative");
      if(marks[i]>100)
         throw new OutOfBoundException("marks sould be in between 0to 100");
     
   }
   sum=sum+marks[i];
   average=(float)sum/n;
}

catch(OutOfRangeException of)
{
System.out.println(of);
}

catch(NegativeMarksException nm)
{
System.out.println(nm);
}

catch(InputMismatchException im)
{
System.out.println(im);
}

catch(ArithmeticException ae)
{
System.out.println(ae);
}

catch(Exception e)
{
System.out.println(e)
}
 
  

  

   


