class Threaddemo
{
 public static void main(String args[])
 {
   System.out.println(Thread.currentThread().getName()); // to know the current thread default thread is main
   System.out.println(Thread.currentThread().getPriority());
 }
}