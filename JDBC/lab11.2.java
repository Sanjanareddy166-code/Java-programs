
class Thread1 extends Thread
{
  public void run()
  {
   String name="GOOD MORNING";
    while(true)
    {
    System.out.println(name);
    try
    {
        Thread.sleep(1000);
    }
    catch(InterruptedException ie)
     {
       System.out.println(ie);
     }
    }
   }
}
class Thread2 extends Thread
{
  public void run()
  {
   String name="HELLO";
    while(true)
    {
    System.out.println(name);
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
class Thread3 extends Thread
{
  public void run()
  {
    String name="WELCOME";
    while(true)
    {
    System.out.println(name);
    try
    {
        Thread.sleep(4000);
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
 Thread2 t2=new Thread2();
 Thread3 t3=new Thread3();
 t1.start();
 t2.start();
 t3.start();
}
}
//to stop printing press ctrl+c