class privatedemo
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
}


/*error: age has private access in privatedemo
System.out.println(p.age);
                    ^
privatevariables.java:13: error: name has private access in privatedemo
System.out.println(p.name);*/