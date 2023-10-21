interface Sample
{
void m1();
}
class Sample1 implements Sample
{
  public void m1()
  {
   System.out.println("hello");
  }
}
class Mainclass
{
public static void main(String args[])
 {
  Sample1 s=new Sample1();
  s.m1();
 }
}