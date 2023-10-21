/*class Parent
{
 public void show()
{
 System.out.println("parentclass");
}
}
class Child extends Parent
{
 public void show()
 {
 System.out.println("childclass");
}
}
class Main
{
 public static void main(String args[])
{
 Child c=new Child();
 c.show();
}
}
 
output:childclass*/

class Parent
{
 public void show()
{
 System.out.println("parentclass");
}
}
class Child extends Parent
{
 public void show()
 {
  super.show();
  System.out.println("childclass");
}
}
class Main
{
 public static void main(String args[])
{
 Child c=new Child();
 c.show();
}
}

 output:parentclass
        childclass