class A
{
int data=50;
void change(int data)
{
data=data+100;
}
public static void main(String args[])
{
A op=new A();
System.out.println(op.data);
op.change(500);
System.out.println(op.data);
}
}