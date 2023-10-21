class Mythread extends Thread
{
 public void run()
 {
  for(int i=0;i<5;i++)
  {
    System.out.println("sita thread");
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
class Main
{
 public static void main(String args[]) throws InterruptedException
 {
  Mythread t=new Mythread();
  t.start();
  t.join();
  for(int i=0;i<5;i++)
  {
     System.out.println("rama thread");
   }
}
}