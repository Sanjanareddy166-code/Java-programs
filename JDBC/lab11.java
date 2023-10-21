class Daemonthread extends Thread
{
 public void run()
 {
  if(Thread.currentThread().isDaemon())
      System.out.println("daemon thread executing");
  else
     System.out.println("normal thread executing");
 }
}
class Main
{
 public static void main(String args[])
 {
  Daemonthread t1=new Daemonthread();
  Daemonthread t2=new Daemonthread();
  t1.setDaemon(true);
  t1.start();
  t2.start();
}
}