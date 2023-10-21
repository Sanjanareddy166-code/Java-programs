// accessing innerclass code from outside of outerclass
//NORMAL OR REGULAR innerclass

//method1

/*class Outer
{
 class Inner
  {
   public void methodone()
   {
      System.out.println("inner demo");
   }
 }
public static void main(String args[])
{
 new Outer().new Inner().methodone(); //not creating objects
}
}
*/

//accessing inner class code from instance area of outer class (method 2)
/*class Outer
{
 class Inner
  {
   public void methodone()
   {
      System.out.println("inner demo");
   }
 }
public void methodtwo()
{ 
 Inner i=new Inner();
 i.methodone();
}
public static void main(String args[])
{
  Outer o=new Outer();
  o.methodtwo();
}
}
*/

//nested inner classes:

class A
{
  class B
  {
   class C
   {
    public void m1()
    {
      System.out.println("c class method");
    }
   }
}
public static void main(String args[])
{
 /*A a=new A();
 A.B b=new B();
A.B.C c=new C();
 c.m1();*/
new A().new B().new C().m1();

}
}