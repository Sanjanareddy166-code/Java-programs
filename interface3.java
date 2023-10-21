/*
vehicle
  Changegear(int gear)
  speed(int s)
  applybrakes(int b)


*/
interface Vehicle
{
  void changegear(int g);
  void increasespeed(int s);
  void applybrake(int b);
}
class Bike implements Vehicle
{
  int gear,speed=20;
  public void changegear(int g) //g=current gear position
  {
    gear=g;
  }
 public void increasespeed(int s) //increase speed
{
  speed=speed+s;
}
public void applybrake(int b)//decrease speed
{
 speed=speed-b;
 }
public void showvehiclestatus()
 {
  System.out.println("bike is currently at speed"+speed+"and on gear"+gear);
}
}

class Car implements Vehicle
{
  int gear,speed=20;
  public void changegear(int g) //g=current gear position
  {
    gear=g;
  }
 public void increasespeed(int s) //increase speed
{
  speed=speed+s;
}
public void applybrake(int b)//decrease speed
{
 speed=speed-b;
 }
public void showvehiclestatus()
 {
  System.out.println("car is currently at speed"+speed+"and on gear"+gear);
}
}
class Mainclass
{
public static void main(String args[])
{
Bike b1=new Bike();
b1.changegear(3);
b1.increasespeed(70);
b1.showvehiclestatus();
b1.applybrake(30);
b1.showvehiclestatus();

Car c1=new Car();
c1.changegear(4);
c1.increasespeed(80);
c1.showvehiclestatus();
c1.applybrake(30);
c1.showvehiclestatus();
}
}