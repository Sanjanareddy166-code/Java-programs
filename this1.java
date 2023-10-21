class A
{
    public A()  //Defautl Constructors
	{
	   this("THUB");  //It calls the parameterized constructor from same class
	   System.out.println("Welcome to Guest");
	
	}
	public A()
	{
		//this();
		System.out.println("Welcome to "+name);
	}
}
class Mainclass
{
	public static void main(String args[])
	{
		A a=new A();
	}
}
