interface I1
{
 void m1();
 void m2();
 default void m3() //default definition is given
 {
   System.out.println("m3 method");
  }
  static void m4()
  {
   System.out.println("static method");
   }
}

class Serviceprovider1 implements I1
{
  public void m1()
  {
   System.out.println("m1 method");
  }
  public void m2()
  {
   System.out.println("m2 method");
  }
}

class Serviceprovider2 implements I1
{
 public void m1()
 {
  System.out.println("m1 method");
 }
 public void m2()
 {
  System.out.println("m2 method");
 }
 public void m3()
 {
 System.out.println("my own definition");
 }
}
class Mainclass
{
 public static void main(String args[])
 {
 I1 i=new Serviceprovider1();
 i.m1();
 i.m2();
 i.m3(); // output:default method
 
 I1 p=new Serviceprovider2();
 p.m1();
 p.m2();
 p.m3();//output: my own method
 I1.m4();
 
 }
}