import java.util.*;
abstract class Shape
{
 int s1,s2; //variable declarations
 float area;
 final float pi=3.142f;
 Scanner sc=new Scanner(System.in); /*if we declare scanner in child class the scope of it ends after that class so declare at parent class*/

 public abstract void getinput(); //abstract method
 public abstract void calculatearea(); //abstract method
 public void showarea() //non abstract method
 {
  System.out.println("area is"+area);
 }
}

class Square extends Shape
{
 public void getinput()
 {
  System.out.println("enter a value");
  s1=sc.nextInt();
  }
  public void calculatearea()
{
  area=s1*s1;
 } 
}
class Rectangle extends Shape
{
 public void getinput()
 {
  System.out.println("enter length and breadth");
  s1=sc.nextInt();
  s2=sc.nextInt();
 }
 public void calculatearea()
{
 area=s1*s2;
 }
}
class Circle extends Shape
{
 public void getinput()
{
  System.out.println("enter radius");
  s1=sc.nextInt();
 }
 public void calculatearea()
{
 area=pi*s1*s1;
}
}
class Mainclass
{
public static void main(String args[])
{
Shape s;


s=new Square();
System.out.println("square");
s.getinput();
s.calculatearea();
s.showarea();


s=new Rectangle();
System.out.println("rectangle");
s.getinput();
s.calculatearea();
s.showarea();

s=new Circle();
System.out.println("circle");
s.getinput();
s.calculatearea();
s.showarea();

}
}