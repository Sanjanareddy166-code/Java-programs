class A
{
public A() 
{

 System.out.println("A constructor");
}
class B extends A
{
 public B()
{
 super();
 System.out.println("b constructor");
}
}
class Mainclass
{
 public static void main(String args[])
 B b=new B();