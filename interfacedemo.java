interface Sample
{
void m1();
void m2();
void m3();
}

abstract class Sample1 implements Sample
{
  public void m1()
  {
   System.out.println("hello");
  }
 public void m2()
 {
  System.out.println("hii");
  }
}

class Sample2 extends Sample1
{
  public void m3()
  {
   System.out.println("good morning");
  }
}

class Mainclass
{
public static void main(String args[])
 {
  Sample2 s=new Sample2();
  s.m1();
  s.m2();
  s.m3();
  }
}