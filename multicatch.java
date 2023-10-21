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

class Exception9
{
 public static void main(String args[])
 {
 int x=10,y,z=0;

 try
 {
  x=Integer.parseInt(args[0]);
  y=Integer.parseInt(args[1]);
  z=x/y;
 }

 catch(ArithmeticException ae) // 50 0
 {
  System.out.println("y should be non zero");
  z=x/2;
 }

 catch(ArrayIndexOutOfBoundsException aoe) // 50
 {
  System.out.println("minimum number of inputs should be 2");
 }

 catch(NumberFormatException nfe) //abc xyz
 {
  System.out.println("input should be numbers");
 }

 catch(Exception e) 
 {
  System.out.println("invalid");
 }

 System.out.println(z);
 System.out.println("completed");
 }
}

output:
D:\javaprograms>java Exception9 50 0
y should be non zero
25
completed

D:\javaprograms>java Exception9 50 2
25
completed

D:\javaprograms>java Exception9 50
minimum number of inputs should be 2
0
completed

D:\javaprograms>java Exception9 50 thub
input should be numbers
0
completed

