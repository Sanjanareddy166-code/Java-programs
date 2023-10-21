/*abstract class Parent
{
 public abstract void m1();
 public void m2()
 {
 System.out.println("Non abstract method");
 }
}
class Child extends Parent
{
 public void m1()
 {
 System.out.println("m1 method from parent class");
 }

 public static void main(String args[])
{
 Child c=new Child();
 c.m1();
 c.m2();
 }
}*/


abstract class Animal
{
 public abstract void makesound();
 public void eat()
 {
   System.out.println("i am eating");/*here we are using same for allanimals if we want to change we can use method overriding*/
  }
}
class Dog extends Animal
{
 public void makesound()
 {
   System.out.println("bow bow...");
  }
}
class Cat extends Animal
{
 public void makesound()
 {
  System.out.println("meow meow...");
 }
}
class Mainclass //while executing the class which contain main method should be used
{
 public static void main(String args[])
{
 Dog d=new Dog();
 d.makesound();
 d.eat();
 Cat c=new Cat();
 c.makesound();
 c.eat();
 }
}