class Sample implements I1,I2
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
System.out.println("m3 method");
}
}
interface I1
{
 void m1();
 void m2();
}
interface I2
{
void m2();
void m3();
}
class Demo
{
public static void main(String args[])
{
 I1 t;
 t=new Sample();
 t.m1();
 t.m2();
 //t.m3(); =>compile error
  
 I2 t1;
 t1=new Sample();
 //t1.m1(); =>compile error
 t1.m2();
 t1.m3();
}
}
