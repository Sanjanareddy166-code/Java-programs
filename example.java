class Test
{
public void display(int x,float y)
{
 System.out.println(x+" "+y);
}
public void display(double p,int q)
{
 System.out.println(p+" "+q);
}

public static void main(String args[])
{
 Test t1=new Test();
 t1.display(10f,2);
}
}
