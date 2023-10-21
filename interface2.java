interface factorial
{
 int fact(int n);
}

class Dev1 implements factorial
{
  public int fact(int n)
  {
   int f=1;
   for(int i=1;i<=n;i++)
     f=f*i;
   return f;
  }
}

class Dev2 implements factorial
{
 public int fact(int n)
 {
    if(n==1)
      return 1;
    else
      return n*fact(n-1);
  }
}

class Main
{
public static void main(String args[])
{
 Dev1 d1=new Dev1();
 System.out.println("implemented through loop"+d1.fact(5));
 
 Dev2 d2=new Dev2();
 System.out.println("implemented through recursion"+d1.fact(5));

}
}