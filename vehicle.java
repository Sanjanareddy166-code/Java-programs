//DYNAMIC METHOD DISPATCHING (single parent class object is overloaded with differnt child class instances)

abstract class Vehicle
{
 public abstract int getnowheels();
 public abstract int seatingcapacity();
}
class Bike extends Vehicle
{
 public int getnowheels()
 {
  return 2;
  }
  public int seatingcapacity()
{
 return 2;
 } 
}
class Auto extends Vehicle
{
 public int getnowheels()
 {
  return 3;
 }
 public int seatingcapacity()
{
 return 4;
 }
}
class Car extends Vehicle
{
 public int getnowheels()
{
 return 4;
 }
 public int seatingcapacity()
{
 return 5;
}
}
class Mainclass
{
public static void main(String args[])
{
Vehicle v;//reference variable
int w,c;

v=new Bike();
System.out.println("bike");
w=v.getnowheels(); 
c=v.seatingcapacity();
System.out.println("no of wheels"+w);
System.out.println("seating capacity"+c);


v=new Auto();
System.out.println("auto");
w=v.getnowheels();
c=v.seatingcapacity();
System.out.println("no of wheels"+w);
System.out.println("seating capacity"+c);

v=new Car();
System.out.println("car");
w=v.getnowheels();
c=v.seatingcapacity();
System.out.println("no of wheels"+w);
System.out.println("seatingcapacity"+c);

}
}