//parent class object storing child class instance

/*class Parent
{
 public void m1()
 {
  System.out.println("m1 method from parent");
 }
  public void m2()
  {
   System.out.println("m2 method from parent");
  }
}
class Child extends Parent
{
 public void m2()
  {
   System.out.println("m2 method from child");
  }
  public void m3()
  {
   System.out.println("m3 method from child");
  }
}
class Mainclass
{
 public static void main(String args[])
 {
Parent p=new Child();
p.m1();
p.m2();
p.m3();
}
}*/

output: error: Parent is not abstract and does not override abstract method m3() in Parent

while creating parentclass object using child classinstance
At the time of COMPILATION it checks whether all the methods in child class are present in parent class or not in the above example m3 method is not present in parent class so,it generates error
Now creating abstract method m3 in parent class

At the time of EXECUTION it executes based on child class

abstract class Parent
{
 public void m1()
 {
  System.out.println("m1 method from parent");
 }
  public void m2()
  {
   System.out.println("m2 method from parent");
  }
  public abstract void m3();
}
class Child extends Parent
{
 public void m2()
  {
   System.out.println("m2 method from child");
  }
  public void m3()
  {
   System.out.println("m3 method from child");
  }
}
class Mainclass
{
 public static void main(String args[])
 {
Parent p=new Child();
p.m1();
p.m2();
p.m3();
}
}

output:m1 method from parent
m2 method from child
m3 method from child




