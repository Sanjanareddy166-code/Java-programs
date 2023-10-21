/*class Thread1 extends Thread
{
  public void run()
  {
   String name="SUPER STAR";
   for(int i=0;i<name.length();i++)
   {
    System.out.println(name.charAt(i)+" ");
    }
   }
}
class Mainclass
{
public static  void main(String args[])
{
 Thread1 t1=new Thread1();
 t1.start();
}
}*/


/* sleep method takes input in milliseconds 2 seconds=2000milliseconds whwenever we use sleep in any thread program  we should write try and catch after printing S it waits for 2 seconds and automatically awake and prints A and so on..*/ 
class Thread1 extends Thread
{
  public void run()
  {
   String name="SANJANA REDDY";
   for(int i=0;i<name.length();i++)
   {
    System.out.println(name.charAt(i)+" ");
    try
    {
        Thread.sleep(2000);
    }
    catch(InterruptedException ie)
     {
       System.out.println(ie);
     }
    }
   }
}
class Mainclass
{
public static  void main(String args[])
{
 Thread1 t1=new Thread1();
 t1.start();
}
}