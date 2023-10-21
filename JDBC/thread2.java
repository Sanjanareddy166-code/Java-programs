//MULTIPLE THREADS
/*class Mythread extends Thread
{
 public void run()
 {
  for(int i=0;i<5;i++)
    System.out.println("Thread"+Thread.currentThread().getName());
  }
}
class Main
{
public static void main(String args[])
{
  Mythread t1=new Mythread(); 
  Mythread t2=new Mythread();
  t1.start(); 
  t2.start();
  for(int i=0;i<5;i++)
     System.out.println("thread"+Thread.currentThread().getName());

 }
}
output:
D:\javaprograms\JDBC>java Main
threadmain
ThreadThread-1
ThreadThread-0
ThreadThread-0
ThreadThread-0
ThreadThread-1
ThreadThread-1
ThreadThread-1
threadmain
ThreadThread-1
ThreadThread-0
ThreadThread-0
threadmain
threadmain
threadmain*/


class Mythread extends Thread
{
 public void run()
 {
  for(int i=0;i<5;i++)
          System.out.println("Thread"+Thread.currentThread().getName());
  }
}
class Main
{
public static void main(String args[])
{
  Mythread t1=new Mythread(); 
  Mythread t2=new Mythread();
  t1.start(); 
  t2.start();
  t1.setName("abc");
  t2.setName("xyz");
  for(int i=0;i<5;i++)
     System.out.println("thread"+Thread.currentThread().getName());

 }
}
output:
D:\javaprograms\JDBC>java Main
threadmain
threadmain
threadmain
threadmain
threadmain
Threadabc
Threadxyz
Threadxyz
Threadabc
Threadabc
Threadxyz
Threadxyz
Threadabc
Threadabc
Threadxyz
