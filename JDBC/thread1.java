class Mythread extends Thread
{
 public void run()
 {
  for(int i=0;i<5;i++)
    System.out.println("abc");
  }
}
class Main
{
public static void main(String args[])
{
  Mythread t1=new Mythread(); // t1--new state
  t1.start(); // new thread t1 is created 
 // total 2 threads main and t1
  for(int i=0;i<5;i++)
     System.out.println("xyz");

 }
}
output:
D:\javaprograms\JDBC>java Main // priority is given for main
xyz
xyz
xyz
xyz
xyz
abc
abc
abc
abc
abc

D:\javaprograms\JDBC>java Main
xyz
abc
abc
xyz
xyz
xyz
xyz
abc
abc
abc
