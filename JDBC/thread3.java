class Thread1 extends Thread
{
  public void run()
  {
   for(int i=10;i>0;i--)
       System.out.println("child1 "+i); // prints 1 to 10 in reverse
  }
}
class Thread2 extends Thread
{
 public void run()
  {
   for(int i=0;i<10;i++) //prints 1 to 10
      System.out.println("child2 "+i);
  }
}
class Main
{
public static void main(String args[])
{
 Thread1 t1=new Thread1();
 Thread2 t2=new Thread2();
 t1.start();
 t2.start();
 for(int i=1;i<=10;i++)
   System.out.println("main thread "+(i*i)); // prints square of a number
}
}
output:
D:\javaprograms\JDBC>java Main
main thread 1
child1 10
child1 9
main thread 4
main thread 9
main thread 16
main thread 25
main thread 36
child2 0
child2 1
child2 2
child2 3
child2 4
child2 5
child2 6
child2 7
child2 8
child2 9
main thread 49
main thread 64
main thread 81
main thread 100
child1 8
child1 7
child1 6
child1 5
child1 4
child1 3
child1 2
child1 1