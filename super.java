class A
{
int x=10;
public void show()
{
System.out.println("A:"+x);
}
}
class B extends A
{
 int x=20;
 public void display()
 {
 System.out.println("B:"+x);
 System.out.println("A:"+super.x);
 }
}
class Super
{
 public static void main(String args[])
{
 B b=new B();
 b.display();
 }
}