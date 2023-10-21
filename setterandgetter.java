/*class privatedemo
{
private int age=10;
private String name="Ramesh";
double salary=20000; //default
}
class Sample
{
public static void main(String args[])
{
privatedemo p=new privatedemo();
System.out.println(p.age);
System.out.println(p.name);
System.out.println(p.salary);
}
}*/


/*error: age has private access in privatedemo
System.out.println(p.age);
                    ^
privatevariables.java:13: error: name has private access in privatedemo
System.out.println(p.name);*/

//TO SOLVE THIS WE USE SETTER AND GETTER METHODS

class privatedemo
{
private int age=10;
private String name="Ramesh";
double salary=20000; //default
public void setAge(int age)
{
 this.age=age;
}
public int getAge()
{
 return age;
}
public void setName(String name)
{
  this.name=name;
}
public String getName()
{
 return name;
}
}

class Sample
{
public static void main(String args[])
{
privatedemo p=new privatedemo();
System.out.println(p.getAge());
System.out.println(p.getName());
System.out.println(p.salary);
//to modify
p.setAge(22);
System.out.println(p.getAge());
}
}
